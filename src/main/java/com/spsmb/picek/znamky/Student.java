package com.spsmb.picek.znamky;

public class Student extends Subject {
    private String name;

    private String surname;


    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public void setName(String text) {
    }
}



