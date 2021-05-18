package com.spring.information.countries.model;

import com.fasterxml.jackson.annotation.*;

public class Language {
    private String iso6391;
    private String iso6392;
    private String name;
    private String nativeName;

    @JsonProperty("iso639_1")
    public String getIso6391() { return iso6391; }
    @JsonProperty("iso639_1")
    public void setIso6391(String value) { this.iso6391 = value; }

    @JsonProperty("iso639_2")
    public String getIso6392() { return iso6392; }
    @JsonProperty("iso639_2")
    public void setIso6392(String value) { this.iso6392 = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("nativeName")
    public String getNativeName() { return nativeName; }
    @JsonProperty("nativeName")
    public void setNativeName(String value) { this.nativeName = value; }
}
