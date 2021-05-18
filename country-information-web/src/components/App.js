import React, { Component } from "react";
import "../style/App.scss";
import Country from "./Country";

class App extends Component {
  render() {
    return (
      <div className="App">
        <Country />
      </div>
    );
  }
}
export default App;
