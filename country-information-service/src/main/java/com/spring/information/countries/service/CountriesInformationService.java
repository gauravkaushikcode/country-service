package com.spring.information.countries.service;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.spring.information.countries.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountriesInformationService {
    private static final Logger log = LoggerFactory.getLogger(CountriesInformationService.class);
    private RestTemplate restTemplate;

    public CountriesInformationService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public MappingJacksonValue getData() throws IOException {
        ResponseEntity<Country[]> responseEntity = restTemplate.getForEntity(
                "https://restcountries.eu/rest/v2/all", Country[].class);
        Country[] countryInfo = responseEntity.getBody();
        return dynamicFilter(Arrays.stream(countryInfo).collect(Collectors.toList()));
    }
    public MappingJacksonValue dynamicFilter(List<Object> locationList) {
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("name", "alpha2Code", "capital", "population", "flag");
        FilterProvider filters = new SimpleFilterProvider().addFilter("DataFilter", filter);
        // Dynamic Filtering
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(locationList);
        // define the above filter on Country class
        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;
    }
}
