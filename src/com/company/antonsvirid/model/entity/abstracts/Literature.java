package com.company.antonsvirid.model.entity.abstracts;

public abstract class Literature implements Libraryable {

    private String name;
    private int sheets;
    private int cost;
    private boolean inRent;
    private boolean readAccess;

    public Literature() {
    }

    public Literature(String name, int sheets, int cost, boolean inRent, boolean readAccess) {
        this.name = name;
        this.sheets = sheets;
        this.cost = cost;
        this.inRent = inRent;
        this.readAccess = readAccess;
    }

    public String getName() {
        return name;
    }

    public int getSheets() {
        return sheets;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isInRent() {
        return inRent;
    }

    public void setInRent(boolean inRent) {
        this.inRent = inRent;
    }

    public boolean isReadAccess() {
        return readAccess;
    }

    public void setReadAccess(boolean readAccess) {
        this.readAccess = readAccess;
    }

    @Override
    public String toString() {
        return "Literature {" +
                "name = '" + name + '\'' +
                ", sheets = " + sheets +
                ", cost = " + cost +
                ", inRent = " + inRent +
                ", readAccess = " + readAccess +
                '}';
    }



}
