package com.demo.colorsapplication.services.impl;

import com.demo.colorsapplication.services.BluePrinter;
import com.demo.colorsapplication.services.ColorPrinter;
import com.demo.colorsapplication.services.GreenPrinter;
import com.demo.colorsapplication.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColorPrinterImpl implements ColorPrinter {
    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;


    public ColorPrinterImpl( RedPrinter redPrinter, GreenPrinter greenPrinter, BluePrinter bluePrinter) {
       this.redPrinter = redPrinter;
       this.greenPrinter = greenPrinter;
       this.bluePrinter = bluePrinter;

    }


    @Override
    public  String print() {
        return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }
}
