package com.tmoreno.kata.romannumerals;

public class DecimalToRomanConverter {

	public String convert(int decimal) {
		StringBuilder result = new StringBuilder();

		if (decimal < 4) {
			for (int i = 0; i < decimal; i++) {
				result.append("I");
			}
		} else if (decimal == 4) {
			result.append("IV");
		} else {
			result.append("V");

			for (int i = 5; i < decimal; i++) {
				result.append("I");
			}
		}

		return result.toString();
	}
}