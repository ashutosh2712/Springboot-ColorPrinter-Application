package com.demo.colorsapplication.config;

import com.demo.colorsapplication.services.BluePrinter;
import com.demo.colorsapplication.services.ColorPrinter;
import com.demo.colorsapplication.services.GreenPrinter;
import com.demo.colorsapplication.services.RedPrinter;
import com.demo.colorsapplication.services.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public BluePrinter bluePrinter () {
        //return new EnglishBluePrinter();
        return new SpanishBluePrinter();
    }

    @Bean
    public GreenPrinter greenPrinter () {
       // return new EnglishGreenPrinter();
        return new SpanishGreenPrinter();
    }

    @Bean
    public RedPrinter redPrinter () {
        //return new EnglishRedPrinter();
        return new SpanishRedPrinter();
    }

    @Bean
    public ColorPrinter colorPrinter ( RedPrinter redPrinter, GreenPrinter greenPrinter, BluePrinter bluePrinter) {
        return  new ColorPrinterImpl(redPrinter, greenPrinter, bluePrinter );
    }


}
