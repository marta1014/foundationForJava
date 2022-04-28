package com.home;

public class Movie {
    private String name;
    private String year;
    private String actor;

    public Movie() {}

    public Movie(String name, String year, String actor) {
        this.name = name;
        this.year = year;
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
