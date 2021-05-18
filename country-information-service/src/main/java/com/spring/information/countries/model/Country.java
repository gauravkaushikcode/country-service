package com.spring.information.countries.model;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonFilter("DataFilter")
public class Country {
    private String name;
    private String[] topLevelDomain;
    private String alpha2Code;
    private String alpha3Code;
    private String[] callingCodes;
    private String capital;
    private String[] altSpellings;
    private String region;
    private String subregion;
    private long population;
    private double[] latlng;
    private String demonym;
    private long area;
    private Double gini;
    private String[] timezones;
    private String[] borders;
    private String nativeName;
    private String numericCode;
    private Currency[] currencies;
    private Language[] languages;
    private Translations translations;
    private String flag;
    private RegionalBloc[] regionalBlocs;
    private String cioc;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("topLevelDomain")
    public String[] getTopLevelDomain() { return topLevelDomain; }
    @JsonProperty("topLevelDomain")
    public void setTopLevelDomain(String[] value) { this.topLevelDomain = value; }

    @JsonProperty("alpha2Code")
    public String getAlpha2Code() { return alpha2Code; }
    @JsonProperty("alpha2Code")
    public void setAlpha2Code(String value) { this.alpha2Code = value; }

    @JsonProperty("alpha3Code")
    public String getAlpha3Code() { return alpha3Code; }
    @JsonProperty("alpha3Code")
    public void setAlpha3Code(String value) { this.alpha3Code = value; }

    @JsonProperty("callingCodes")
    public String[] getCallingCodes() { return callingCodes; }
    @JsonProperty("callingCodes")
    public void setCallingCodes(String[] value) { this.callingCodes = value; }

    @JsonProperty("capital")
    public String getCapital() { return capital; }
    @JsonProperty("capital")
    public void setCapital(String value) { this.capital = value; }

    @JsonProperty("altSpellings")
    public String[] getAltSpellings() { return altSpellings; }
    @JsonProperty("altSpellings")
    public void setAltSpellings(String[] value) { this.altSpellings = value; }

    @JsonProperty("region")
    public String getRegion() { return region; }
    @JsonProperty("region")
    public void setRegion(String value) { this.region = value; }

    @JsonProperty("subregion")
    public String getSubregion() { return subregion; }
    @JsonProperty("subregion")
    public void setSubregion(String value) { this.subregion = value; }

    @JsonProperty("population")
    public long getPopulation() { return population; }
    @JsonProperty("population")
    public void setPopulation(long value) { this.population = value; }

    @JsonProperty("latlng")
    public double[] getLatlng() { return latlng; }
    @JsonProperty("latlng")
    public void setLatlng(double[] value) { this.latlng = value; }

    @JsonProperty("demonym")
    public String getDemonym() { return demonym; }
    @JsonProperty("demonym")
    public void setDemonym(String value) { this.demonym = value; }

    @JsonProperty("area")
    public long getArea() { return area; }
    @JsonProperty("area")
    public void setArea(long value) { this.area = value; }

    @JsonProperty("gini")
    public Double getGini() { return gini; }
    @JsonProperty("gini")
    public void setGini(Double value) { this.gini = value; }

    @JsonProperty("timezones")
    public String[] getTimezones() { return timezones; }
    @JsonProperty("timezones")
    public void setTimezones(String[] value) { this.timezones = value; }

    @JsonProperty("borders")
    public String[] getBorders() { return borders; }
    @JsonProperty("borders")
    public void setBorders(String[] value) { this.borders = value; }

    @JsonProperty("nativeName")
    public String getNativeName() { return nativeName; }
    @JsonProperty("nativeName")
    public void setNativeName(String value) { this.nativeName = value; }

    @JsonProperty("numericCode")
    public String getNumericCode() { return numericCode; }
    @JsonProperty("numericCode")
    public void setNumericCode(String value) { this.numericCode = value; }

    @JsonProperty("currencies")
    public Currency[] getCurrencies() { return currencies; }
    @JsonProperty("currencies")
    public void setCurrencies(Currency[] value) { this.currencies = value; }

    @JsonProperty("languages")
    public Language[] getLanguages() { return languages; }
    @JsonProperty("languages")
    public void setLanguages(Language[] value) { this.languages = value; }

    @JsonProperty("translations")
    public Translations getTranslations() { return translations; }
    @JsonProperty("translations")
    public void setTranslations(Translations value) { this.translations = value; }

    @JsonProperty("flag")
    public String getFlag() { return flag; }
    @JsonProperty("flag")
    public void setFlag(String value) { this.flag = value; }

    @JsonProperty("regionalBlocs")
    public RegionalBloc[] getRegionalBlocs() { return regionalBlocs; }
    @JsonProperty("regionalBlocs")
    public void setRegionalBlocs(RegionalBloc[] value) { this.regionalBlocs = value; }

    @JsonProperty("cioc")
    public String getCioc() { return cioc; }
    @JsonProperty("cioc")
    public void setCioc(String value) { this.cioc = value; }
}
