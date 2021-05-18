import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { Table } from "reactstrap";
import { faWindowClose } from "@fortawesome/free-solid-svg-icons";
import "../style/Modal.scss";
const Modal = ({ handleClose, show, countryInfo }) => {
  const showHideClassName = show ? "modal display-block" : "modal display-none";
  return (
    <div className={showHideClassName}>
      <section className="modal-main map-padding ">
        <FontAwesomeIcon
          className="pull-right"
          icon={faWindowClose}
          onClick={handleClose}
        ></FontAwesomeIcon>
        <p>Country Info:</p>
        <Table responsive>
          <thead>
            <tr>
              <th>Country Name</th>
              <th>Country Code</th>
              <th>Capital</th>
              <th>Flag</th>
              <th>Population</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>{countryInfo.name}</td>
              <td>{countryInfo.alpha2Code}</td>
              <td>{countryInfo.capital}</td>
              <td>
                <a href={countryInfo.flag}>Flag</a>
              </td>
              <td>{countryInfo.population}</td>
            </tr>
          </tbody>
        </Table>
      </section>
    </div>
  );
};
export default Modal;
