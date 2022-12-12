package com.company.antonsvirid.model.entity;

public class Book extends Literature{

    public Book() {
    }

    public Book(String name, int sheets, int cost, boolean inRent, boolean readAccess) {
        super(name, sheets, cost, inRent, readAccess);
    }



}
