package ru.vit.curs;

import org.springframework.stereotype.Component;

@Component
public class Company {
    private Address address;

    // getter, setter and other properties

    public Company(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}