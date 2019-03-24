package com.example.Calculator.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorResource {


    @RequestMapping("/suma/{termen1}/{termen2}")
    public String Suma(@PathVariable("termen1") int x, @PathVariable("termen2") int y){
        int result = x + y;
        return x + " + " + y + " = " + result;
    }

    @RequestMapping("/produs/{termen1}/{termen2}")
    public String Produs(@PathVariable("termen1") int x, @PathVariable("termen2") int y){
        int result = x * y;
        return x + " * " + y + " = " + result;
    }

    @RequestMapping("/scadere/{termen1}/{termen2}")
    public String Scadere(@PathVariable("termen1") int x, @PathVariable("termen2") int y){
        int result = x - y;
        return x + " - " + y + " = " + result;
    }

    @RequestMapping("/impartire/{termen1}/{termen2}")
    public String Impartire(@PathVariable("termen1") int x, @PathVariable("termen2") int y){
        if(y == 0)
            return "Impartirea nu se poate efectua";
        else {
            int result = x / y;
            return x + " / " + y + " = " + result;
        }
    }

}
