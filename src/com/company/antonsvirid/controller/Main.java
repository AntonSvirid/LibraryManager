package com.company.antonsvirid.controller;

import com.company.antonsvirid.model.entity.Book;
import com.company.antonsvirid.model.entity.abstracts.Libraryable;
import com.company.antonsvirid.model.entity.Magazine;
import com.company.antonsvirid.view.Printer;

public class Main {
    public static void main(String[] args) {

        // small application script:

        Libraryable[] literature = new Libraryable[]{
                new Book("Harry", 123, 100, false, true),
                new Magazine("ABS", 65, 20, true, false)
        };


        String msg = literature[1].toString();

        Printer.print(msg);
    }
}
