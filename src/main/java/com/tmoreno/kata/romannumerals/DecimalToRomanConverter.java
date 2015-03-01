package com.tmoreno.kata.romannumerals;

public class DecimalToRomanConverter {

	public String convert(int decimal) {
		String result = "";

		if (decimal >= 10) {
			int tens = decimal / 10;

			if (tens >= 1 && tens < 4) {
				result = addLetterNTimes("X", tens);
			} else if (tens >= 4 && tens < 5) {
				result = "XL";
			} else if (tens >= 5 && tens < 9) {
				result = "L" + addLetterNTimes("X", tens % 5);
			} else {
				result = "XC";
			}
		}

		return result + convertUnits(decimal % 10);
	}

	private String convertUnits(int unit) {
		switch (unit) {
		case 1:
		case 2:
		case 3:
			return addLetterNTimes("I", unit);

		case 4:
			return "IV";

		case 5:
		case 6:
		case 7:
		case 8:
			return "V" + addLetterNTimes("I", unit % 5);

		case 9:
			return "IX";

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