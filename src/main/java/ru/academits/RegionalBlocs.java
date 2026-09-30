package ru.academits;

public class RegionalBlocs { private String acronym;
    private String name;
    private String[] otherAcronyms; //assumed data type to be string
    private Country[] otherNames;

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getOtherAcronyms() {
        return otherAcronyms;
    }

    public void setOtherAcronyms(String[] otherAcronyms) {
        this.otherAcronyms = otherAcronyms;
    }

    public Country[] getOtherNames() {
        return otherNames;
    }

    public void setOtherNames(Country[] otherNames) {
        this.otherNames = otherNames;
    }
}