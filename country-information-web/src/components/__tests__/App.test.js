import React from "react";
import { shallow } from "enzyme";

import App from "../App";
import Country from "../Country";
let wrappedAppComponent;
beforeEach(() => {
  wrappedAppComponent = shallow(<App />);
});

it("shows country", () => {
  expect(wrappedAppComponent.find(Country).length).toEqual(1);
});
