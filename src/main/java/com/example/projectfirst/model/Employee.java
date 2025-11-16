package com.example.projectfirst.model;

public class Employee {
    public int id;
    public String name;
    public String email;
    public String designation;
    public Address address;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", designation='" + designation + '\'' +
                ", address=" + address +
                '}';
    }
}
