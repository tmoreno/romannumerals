package com.tmoreno.kata.romannumerals;

public class DecimalToRomanConverter {

	public String convert(int decimal) {
		String result = "";

		if (decimal >= 10) {
			int tens = decimal / 10;

			switch (tens) {
			case 1:
			case 2:
			case 3:
				result = addLetterNTimes("X", tens);
				break;

			case 4:
				result = "XL";
				break;

			case 5:
			case 6:
			case 7:
			case 8:
				result = "L" + addLetterNTimes("X", tens % 5);
				break;

			case 9:
				result = "XC";
				break;

			default:
				result = "";
				break;
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