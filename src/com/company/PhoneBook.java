package com.company;

public class PhoneBook {
    private Person[] persons = new Person[20];

    public void addPersons(Person[] persons) {

        this.persons = persons;
    }

    public Person[] getPersons() {
        return this.persons;
    }
}
