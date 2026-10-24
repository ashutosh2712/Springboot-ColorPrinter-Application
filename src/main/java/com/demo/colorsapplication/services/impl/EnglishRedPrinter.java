package com.demo.colorsapplication.services.impl;

import com.demo.colorsapplication.services.RedPrinter;
import org.springframework.stereotype.Component;


@Component
public class EnglishRedPrinter implements RedPrinter {

    @Override
    public String print() {
        return "red";
    }
}
