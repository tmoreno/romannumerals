package com.tmoreno.kata.romannumerals;

public class DecimalToRomanConverter {

    public String convert(int decimal) {
        if (decimal < 1) {
            throw new IllegalArgumentException(
                    "Can not convert numbers less than 1");
        }

        int thousands = decimal / 1000;
        int hundreds = (decimal % 1000) / 100;
        int tens = ((decimal % 1000) % 100) / 10;
        int units = ((decimal % 1000) % 100) % 10;

        String result = convertDigit(thousands, "M", "", "");
        result += convertDigit(hundreds, "C", "D", "M");
        result += convertDigit(tens, "X", "L", "C");
        result += convertDigit(units, "I", "V", "X");

        return result;
    }

    private String convertDigit(int digit, String minLetter,
            String mediumLetter, String maxLetter) {
        switch (digit) {
        case 1:
        case 2:
        case 3:
            return addLetterNTimes(minLetter, digit);

        case 4:
            return minLetter + mediumLetter;

        case 5:
        case 6:
        case 7:
        case 8:
            return mediumLetter + addLetterNTimes(minLetter, digit % 5);

        case 9:
            return minLetter + maxLetter;

        default:
            return "";
        }
    }

    private String addLetterNTimes(String letter, int numbresOftimes) {
        String result = "";

        for (int i = 0; i < numbresOftimes; i++) {
            result += letter;
        }

        return result;
    }
}