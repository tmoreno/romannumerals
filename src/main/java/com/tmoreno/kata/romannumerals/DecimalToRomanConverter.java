package com.tmoreno.kata.romannumerals;

public class DecimalToRomanConverter {

	public String convert(int decimal) {
		if (decimal >= 10) {
			if (decimal < 14) {
				return "X" + convertUnits(decimal % 10);
			} else {
				return "X" + convertUnits(4);
			}
		} else {
			return convertUnits(decimal);
		}
	}

	private String convertUnits(int number) {
		String result = "";

		if (number < 4) {
			result += addI(number);
		} else if (number == 4) {
			result += "IV";
		} else if (number == 9) {
			result += "IX";
		} else {
			result += "V" + addI(number % 5);
		}

		return result;
	}

	private String addI(int numbresOfI) {
		String result = "";

		for (int i = 0; i < numbresOfI; i++) {
			result += "I";
		}

		return result;
	}
}