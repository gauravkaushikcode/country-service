package com.spring.information.countries.model;

import com.fasterxml.jackson.annotation.*;

public class RegionalBloc {
    private String acronym;
    private String name;
    private Object[] otherAcronyms;
    private Object[] otherNames;

    @JsonProperty("acronym")
    public String getAcronym() { return acronym; }
    @JsonProperty("acronym")
    public void setAcronym(String value) { this.acronym = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("otherAcronyms")
    public Object[] getOtherAcronyms() { return otherAcronyms; }
    @JsonProperty("otherAcronyms")
    public void setOtherAcronyms(Object[] value) { this.otherAcronyms = value; }

    @JsonProperty("otherNames")
    public Object[] getOtherNames() { return otherNames; }
    @JsonProperty("otherNames")
    public void setOtherNames(Object[] value) { this.otherNames = value; }
}
