package com.company.antonsvirid.model.entity;

import com.company.antonsvirid.model.entity.abstracts.Literature;

public class Brochure extends Literature {

    public Brochure() {
    }

    public Brochure(String name, int sheets, int cost, boolean inRent, boolean readAccess) {
        super(name, sheets, cost, inRent, readAccess);
    }



}
