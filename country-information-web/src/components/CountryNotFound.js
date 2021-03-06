import React from "react";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faStream } from "@fortawesome/free-solid-svg-icons";
import NoCountry from "../images/no-country.png";

const CountryNotFound = ({ heading = "", subHeading = "" }) => {
  return (
    <div className="d-center">
      <img src={NoCountry} alt="no Country"></img>
      <div className="dark">{heading}</div>
      <div className="light small">{subHeading}</div>
      <FontAwesomeIcon icon={faStream}></FontAwesomeIcon>
    </div>
  );
};
export default CountryNotFound;
