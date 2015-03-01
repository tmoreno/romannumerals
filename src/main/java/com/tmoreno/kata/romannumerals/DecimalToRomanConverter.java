package com.tmoreno.kata.romannumerals;

public class DecimalToRomanConverter {

	public String convert(int decimal) {
		String result = "";

		if (decimal >= 10) {
			if (decimal >= 10 && decimal < 40) {
				result = addLetterNTimes("X", decimal / 10);
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