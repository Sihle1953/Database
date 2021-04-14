package com.example.demo;

import org.springframework.stereotype.Controller;

@Controller
public class Databases {

    private String Name;
    private String lastName;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}