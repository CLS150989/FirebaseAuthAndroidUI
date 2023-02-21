package com.example.firebaseauthuiandroid;

public class City {
    boolean capital;
    String country;
    String name;
    Long population;
    String state;

    public City() {
    }

    public City(boolean capital, String country, String name, Long population, String state) {
        this.capital = capital;
        this.country = country;
        this.name = name;
        this.population = population;
        this.state = state;
    }

    public boolean isCapital() {
        return capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
