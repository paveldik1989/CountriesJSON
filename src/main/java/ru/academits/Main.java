package ru.academits;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.DeserializationFeature;
import tools.jackson.databind.json.JsonMapper;

import java.io.File;
import java.util.Arrays;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        JsonMapper mapper = JsonMapper.builder()
                .disable(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)
                .build();

        List<Country> countries = mapper.readValue(
                new File("src/main/java/ru/academits/countries.json"),
                new TypeReference<List<Country>>() {
                }
        );

        int totalPopulation = countries.stream()
                .map(Country::getPopulation)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(totalPopulation);

        Set<Currency> currencies = countries.stream()
                .map(Country::getCurrencies)
                .flatMap(Arrays::stream)
                .collect(Collectors.toSet());
        System.out.println(currencies);

        List<Country> countriesWithPopulationOverMillion = countries.stream()
                .filter(country -> country.getPopulation() >= 1000000)
                .toList();
        System.out.println(countriesWithPopulationOverMillion);

        mapper.writeValue(new File("src/main/java/ru/academits/result.json"), countriesWithPopulationOverMillion);
    }
}