import React, { Component } from "react";
import { Table } from "reactstrap";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faSortUp, faSortDown } from "@fortawesome/free-solid-svg-icons";

import CountryHeader from "./CountryHeader";
import CountryBlank from "./CountryNotFound";
import baseURL from "../constant/network.constant";
import Pagination from "./Pagination";
import CountryModal from "./CountryModal";
class Country extends Component {
  constructor(props) {
    super(props);
    this.state = {
      countryList: [],
      holdAllCountryList: [],
      options: {
        limit: 10,
        page: 1,
        totalCount: 0,
      },
      sortName: undefined,
      sortOrder: "asc",
    };
  }
  getUpdatedCountryList(holdAllCountryList) {
    let totalCount = holdAllCountryList.length,
      { limit, page } = this.state.options,
      start = limit * page - limit,
      end = start + limit,
      countryList = holdAllCountryList.slice(start, end);
    if (!countryList.length) {
      page = page - 1 || 1;
      start = limit * page - limit;
      end = start + limit;
      countryList = holdAllCountryList.slice(start, end);
    }
    return {
      countryList,
      totalCount,
      page,
    };
  }

  // when component is mounting call to backend API
  componentDidMount() {
    let myRequest = new Request(`${baseURL}/countries/`, {
      headers: { "Content-Type": "application/json; charset=utf-8" },
      method: "GET",
    });
    fetch(myRequest)
      .then((res) => res.json())
      .then((response) => {
        //add pagination option
        const holdAllCountryList = response,
          { countryList, totalCount, page } =
            this.getUpdatedCountryList(holdAllCountryList);
        if (totalCount) {
          this.setState((prev) => {
            return {
              holdAllCountryList,
              countryList,
              options: {
                ...prev.options,
                totalCount,
                page,
              },
            };
          });
        }
      });
  }
  onChange(data) {
    const {
        options: { limit: preLimit, page: prePage },
        holdAllCountryList,
      } = this.state,
      { limit = preLimit, page = prePage } = data,
      start = limit * page - limit,
      end = start + limit,
      countryList = holdAllCountryList.slice(start, end);
    this.setState({
      countryList,
      options: Object.assign(this.state.options, data),
    });
  }

  sortData(column) {
    let {
        holdAllCountryList,
        sortOrder,
        sortName,
        options: { limit, page },
      } = this.state,
      order = "asc",
      orderBy = sortName || column;

    if (sortName === column) {
      order = sortOrder === "asc" ? "dsc" : "asc";
    } else {
      orderBy = column;
    }

    let sortedData = holdAllCountryList.sort((a, b) => {
      const bandA = column === "id" ? a[column] : a[column].toUpperCase();
      const bandB = column === "id" ? b[column] : b[column].toUpperCase();
      let comparison = 0;
      if (bandA > bandB) {
        comparison = 1;
      } else if (bandA < bandB) {
        comparison = -1;
      }
      if (order === "asc") {
        return comparison;
      } else {
        return comparison * -1;
      }
    });

    const start = limit * page - limit,
      end = start + limit,
      countryList = holdAllCountryList.slice(start, end);

    this.setState({
      holdAllCountryList: sortedData,
      sortName: orderBy,
      sortOrder: order,
      countryList,
    });
  }
  render() {
    let { countryList, options, sortName, sortOrder } = this.state;
    return (
      <>
        <CountryHeader />
        {
          <Table responsive className="country-table">
            <thead>
              <tr>
                <th onClick={this.sortData.bind(this, "name")}>
                  Country Name
                  {sortName === "name" && (
                    <FontAwesomeIcon
                      className="sort-icon up"
                      icon={sortOrder === "asc" ? faSortUp : faSortDown}
                      title="sort"
                    ></FontAwesomeIcon>
                  )}
                </th>
                <th>Country Code</th>
                <th>More Information</th>
              </tr>
            </thead>
            <tbody>
              {countryList.map(
                ({ name, alpha2Code, capital, population, flag }) => (
                  <tr key={name}>
                    <td>
                      <span className="round">{name}</span>
                    </td>
                    <td>{alpha2Code}</td>
                    <td>
                      <CountryModal clickedCountry={{ country: name }} />
                    </td>
                  </tr>
                )
              )}
            </tbody>

            <tfoot>
              <Pagination options={options} onChange={this.onChange.bind(this)}>
                {" "}
              </Pagination>
            </tfoot>
          </Table>
        }
        {!countryList.length && (
          <CountryBlank
            heading="Kindly Wait"
            subHeading="country data is loading"
          ></CountryBlank>
        )}
      </>
    );
  }
}
export default Country;
