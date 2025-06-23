package com.impulse.foundersapp;

public class Founder {
    public String name;
    public int imageResId;
    public String description;
    public String company;
    public String birthYear;
    public String netWorth;

    public Founder(String name, int imageResId, String description,
                   String company, String birthYear, String netWorth) {
        this.name = name;
        this.imageResId = imageResId;
        this.description = description;
        this.company = company;
        this.birthYear = birthYear;
        this.netWorth = netWorth;
    }
}

