package com.spring.information.countries.model;

import com.fasterxml.jackson.annotation.*;

public class Translations {
    private String de;
    private String es;
    private String fr;
    private String ja;
    private String it;
    private String br;
    private String pt;
    private String nl;
    private String hr;
    private String fa;

    @JsonProperty("de")
    public String getDe() { return de; }
    @JsonProperty("de")
    public void setDe(String value) { this.de = value; }

    @JsonProperty("es")
    public String getEs() { return es; }
    @JsonProperty("es")
    public void setEs(String value) { this.es = value; }

    @JsonProperty("fr")
    public String getFr() { return fr; }
    @JsonProperty("fr")
    public void setFr(String value) { this.fr = value; }

    @JsonProperty("ja")
    public String getJa() { return ja; }
    @JsonProperty("ja")
    public void setJa(String value) { this.ja = value; }

    @JsonProperty("it")
    public String getIt() { return it; }
    @JsonProperty("it")
    public void setIt(String value) { this.it = value; }

    @JsonProperty("br")
    public String getBr() { return br; }
    @JsonProperty("br")
    public void setBr(String value) { this.br = value; }

    @JsonProperty("pt")
    public String getPt() { return pt; }
    @JsonProperty("pt")
    public void setPt(String value) { this.pt = value; }

    @JsonProperty("nl")
    public String getNl() { return nl; }
    @JsonProperty("nl")
    public void setNl(String value) { this.nl = value; }

    @JsonProperty("hr")
    public String getHr() { return hr; }
    @JsonProperty("hr")
    public void setHr(String value) { this.hr = value; }

    @JsonProperty("fa")
    public String getFa() { return fa; }
    @JsonProperty("fa")
    public void setFa(String value) { this.fa = value; }
}
