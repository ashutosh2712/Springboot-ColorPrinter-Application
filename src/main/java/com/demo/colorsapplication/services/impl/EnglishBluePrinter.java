package com.demo.colorsapplication.services.impl;

import com.demo.colorsapplication.services.BluePrinter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class EnglishBluePrinter implements BluePrinter {

    @Override
    public String print() {
        return "blue";
    }
}
