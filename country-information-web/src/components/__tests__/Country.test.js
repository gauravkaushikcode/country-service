import React from "react";
import { mount } from "enzyme";

import App from "../App";
import Country from "../Country";

let wrappedCountryComponent;
beforeEach(() => {
  const initialState = {
    Country: ["Country Name", "Country Code", "More Information"],
  };
  wrappedCountryComponent = mount(
    <App>
      <Country initialState={initialState} />
    </App>
  );
});
afterEach(() => {
  wrappedCountryComponent.unmount();
});
it("has a table and pagination in footer", () => {
  expect(wrappedCountryComponent.find("table").length).toEqual(1);
  expect(wrappedCountryComponent.find("thead").length).toEqual(1);
  expect(wrappedCountryComponent.find("tfoot").length).toEqual(1);
});
it("creates one td per Country", () => {
  expect(wrappedCountryComponent.find("td").length).toEqual(1);
});
it("shows the text Name, Country Code and more information for each Country", () => {
  expect(wrappedCountryComponent.render().text()).toContain("Country Name");
  expect(wrappedCountryComponent.render().text()).toContain("Country Code");
  expect(wrappedCountryComponent.render().text()).toContain("More Information");
});
