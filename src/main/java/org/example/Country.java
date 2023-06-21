package org.example;

import java.util.Objects;

public class Country {
    private String countryId;

    private String countryName;

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }


    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country1 = (Country) o;
        return Objects.equals(countryId, country1.countryId) && Objects.equals(country, country1.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryId, country);
    }*/

}
