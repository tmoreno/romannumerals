package com.tmoreno.kata.romannumerals;

public class DecimalToRomanConverter {

	public String convert(int decimal) {
		int hundreds = decimal / 100;
		int tens = (decimal % 100) / 10;
		int units = (decimal % 100) % 10;

		String result = convertUnits(hundreds, "C", "D", "M");
		result += convertUnits(tens, "X", "L", "C");
		result += convertUnits(units, "I", "V", "X");

		return result;
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