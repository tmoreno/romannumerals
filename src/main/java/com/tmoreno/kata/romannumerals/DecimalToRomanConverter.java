package com.tmoreno.kata.romannumerals;

public class DecimalToRomanConverter {

	public String convert(int decimal) {
		String result = "";

		if (decimal < 4) {
			for (int i = 0; i < decimal; i++) {
				result += "I";
			}
		} else if (decimal == 4) {
			result += "IV";
		} else {
			result += "V";

			for (int i = 5; i < decimal; i++) {
				result += "I";
			}
		}

		return result;
	}
}