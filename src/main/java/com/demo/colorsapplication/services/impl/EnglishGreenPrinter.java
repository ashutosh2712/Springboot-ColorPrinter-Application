package com.demo.colorsapplication.services.impl;

import com.demo.colorsapplication.services.GreenPrinter;
import org.springframework.stereotype.Component;


@Component
public class EnglishGreenPrinter implements GreenPrinter {

    @Override
    public String print() {
        return "green";
    }
}
