package com.example.projectfirst.model;

public class Address {
    public int doorNo;
    public String streetName;
    public String city;

    @Override
    public String toString() {
        return "Address{" +
                "doorNo=" + doorNo +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
