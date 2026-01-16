package org.example.module_6.character_stream.json_file;

public class Person2 {
    String personName;

    public String getPersonName() {
        return personName;
    }

    public Address getAddress() {
        return address;
    }

    Address address;

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", address street=" + address.street +
                " city =" + address.city +
                '}';
    }
}
