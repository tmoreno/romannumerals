package com.tmoreno.kata.romannumerals;

public class DecimalToRomanConverter {

    public String convert(int decimal) {
        switch (decimal) {
		case 1:
			return "I";
		case 5:
			return "V";
		default:
			StringBuilder result = new StringBuilder();
			
			for (int i = 0; i < decimal; i++) {
	            result.append("I");
	        }
	        
	        if (decimal > 3) {
	        	result.setLength(1);
	        	result.append("V");
	        }

	        return result.toString();
		}
    }
}