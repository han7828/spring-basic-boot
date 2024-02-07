package com.example.springbasicboot.reqres;

public class Contries {
    String name;
    String capital;

    public Contries(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }
}
