import React, { Component } from "react";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faInfoCircle } from "@fortawesome/free-solid-svg-icons";
import baseURL from "../constant/network.constant";
import Modal from "./Modal";

class CountryModal extends Component {
  constructor(props) {
    super(props);
    this.state = {
      show: false,
      countryInfo: {},
    };
    this.showModal = this.showModal.bind(this);
    this.hideModal = this.hideModal.bind(this);
  }

  showModal = () => {
    this.setState({
      show: true,
    });
  };

  hideModal = () => {
    this.setState({ show: false });
  };
  // when component is mounting call to backend API
  componentDidMount() {
    const countryName = this.props.clickedCountry.country;
    const url = `${baseURL}/countries/` + countryName;
    fetch(url, { mode: "cors" })
      .then((response) => response.json())
      .then((response) => {
        this.setState({ countryInfo: response[0] });
      });
  }
  render() {
    return (
      <>
        <Modal
          show={this.state.show}
          handleClose={this.hideModal}
          countryInfo={this.state.countryInfo}
        ></Modal>
        <p>
          <FontAwesomeIcon
            icon={faInfoCircle}
            onClick={this.showModal}
          ></FontAwesomeIcon>
        </p>
      </>
    );
  }
}
export default CountryModal;
