package org.example;

public class Employee {
    private String name;
    private int age;

    private Country country;

    public Employee(String name, int age, Country country) {
        super();
        this.name = name;
        this.age = age;
        this.country = country;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
    public String toString()
    {
        return "Employee Name: "+name+" age: "+age;
    }
}