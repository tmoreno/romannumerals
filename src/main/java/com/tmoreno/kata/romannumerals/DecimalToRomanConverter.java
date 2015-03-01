package com.tmoreno.kata.romannumerals;

public class DecimalToRomanConverter {

	public String convert(int decimal) {
		String result = "";

		if (decimal >= 10) {
			if (decimal >= 10 && decimal < 40) {
				result += addLetterNTimes("X", decimal / 10);
			} else if (decimal >= 40 && decimal < 50) {
				result = "XL";
			} else if (decimal >= 50 && decimal < 90) {
				result = "L" + addLetterNTimes("X", (decimal / 10) % 5);
			} else {
				result = "XC";
			}
		}

		return result + convertUnits(decimal % 10);
	}

	private String convertUnits(int number) {
		String result = "";

		if (number < 4) {
			result += addLetterNTimes("I", number);
		} else if (number == 4) {
			result += "IV";
		} else if (number == 9) {
			result += "IX";
		} else {
			result += "V" + addLetterNTimes("I", number % 5);
		}

		return result;
	}

	private String addLetterNTimes(String letter, int numbresOftimes) {
		String result = "";

		for (int i = 0; i < numbresOftimes; i++) {
			result += letter;
		}

		return result;
	}
}