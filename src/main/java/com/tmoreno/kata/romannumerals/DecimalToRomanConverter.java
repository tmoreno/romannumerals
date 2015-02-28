package com.tmoreno.kata.romannumerals;

public class DecimalToRomanConverter {

    public String convert(int i) {
        if (i == 1) {
            return "I";
        }
        else {
            return "II";
        }
    }
}