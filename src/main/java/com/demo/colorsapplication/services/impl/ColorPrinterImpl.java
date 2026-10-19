package com.demo.colorsapplication.services.impl;

import com.demo.colorsapplication.services.BluePrinter;
import com.demo.colorsapplication.services.ColorPrinter;
import com.demo.colorsapplication.services.GreenPrinter;
import com.demo.colorsapplication.services.RedPrinter;

public class ColorPrinterImpl implements ColorPrinter {
    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;


    public ColorPrinterImpl() {
        this.redPrinter = new EnglishRedPrinter();
        this.bluePrinter = new EnglishBluePrinter();
        this.greenPrinter = new EnglishGreenPrinter();
    }


    @Override
    public  String print() {
        return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }
}
