package com.stackroute.Configuration;

public class Person {
    private String name;
    private String password;

    @Override
    public String toString() {
        return name;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
