package com.tmoreno.kata.romannumerals;

public class DecimalToRomanConverter {

    public String convert(int decimal) {
        String result = "";

        for (int i = 0; i < decimal; i++) {
            result += "I";
        }

        return result;
    }
}