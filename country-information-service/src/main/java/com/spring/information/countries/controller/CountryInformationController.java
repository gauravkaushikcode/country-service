package com.spring.information.countries.controller;

import com.spring.information.countries.service.CountriesInformationService;
import com.spring.information.countries.service.CountryInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CountryInformationController {

    @Autowired
    private CountriesInformationService countriesInformationService;

    @Autowired
    private CountryInformationService countryInformationService;

    @GetMapping("/countries")
    public MappingJacksonValue getAllCountries() throws IOException {
        return countriesInformationService.getData();
    }
    @GetMapping("/countries/{name}")
    public MappingJacksonValue getCountryInformation(@PathVariable String name) throws IOException {
        return countryInformationService.getCountryInformation(name);
    }
}
