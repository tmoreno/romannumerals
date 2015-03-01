package com.tmoreno.kata.romannumerals;

public class DecimalToRomanConverter {

	public String convert(int decimal) {
		String result = "";

		if (decimal >= 10) {
			int tens = decimal / 10;

			result = convertUnits(tens, "X", "L", "C");
		}

		return result + convertUnits(decimal % 10, "I", "V", "X");
	}

	private String convertUnits(int unit, String minLetter,
			String mediumLetter, String maxLetter) {
		switch (unit) {
		case 1:
		case 2:
		case 3:
			return addLetterNTimes(minLetter, unit);

		case 4:
			return minLetter + mediumLetter;

		case 5:
		case 6:
		case 7:
		case 8:
			return mediumLetter + addLetterNTimes(minLetter, unit % 5);

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