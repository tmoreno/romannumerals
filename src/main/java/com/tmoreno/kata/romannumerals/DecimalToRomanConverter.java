package com.tmoreno.kata.romannumerals;

public class DecimalToRomanConverter {

	public String convert(int decimal) {
		if (decimal >= 10) {
			return addLetterNTimes("X", decimal / 10)
					+ convertUnits(decimal % 10);
		} else {
			return convertUnits(decimal);
		}
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