package com.demo.colorsapplication;

import com.demo.colorsapplication.services.ColorPrinter;
import com.demo.colorsapplication.services.impl.ColorPrinterImpl;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class ColorsApplication  implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ColorsApplication.class, args);
    }

    @Override
    public void run(final String... args) throws Exception {
        final ColorPrinter colorPrinter = new ColorPrinterImpl();
        log.info(colorPrinter.print());
    }
}

