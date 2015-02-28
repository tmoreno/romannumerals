package com.tmoreno.kata.romannumerals;

public class DecimalToRomanConverter {

	public String convert(int decimal) {
		String result = "";

		if (decimal < 4) {
			result += addI(decimal);
		} else if (decimal == 4) {
			result += "IV";
		} else {
			result += "V" + addI(decimal % 5);
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