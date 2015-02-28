package com.tmoreno.kata.romannumerals;

public class DecimalToRomanConverter {

    public String convert(int i) {
        if (i == 1) {
            return "I";
        }
        else if (i == 2) {
            return "II";
        }
        else {
            return "III";
        }
    }
}