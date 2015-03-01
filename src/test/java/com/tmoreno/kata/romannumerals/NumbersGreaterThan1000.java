package com.tmoreno.kata.romannumerals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumbersGreaterThan1000 {

	private DecimalToRomanConverter converter;

	@Before
	public void init() {
		converter = new DecimalToRomanConverter();
	}

	@Test
	public void given1000getM() {
		String result = converter.convert(1000);
		Assert.assertEquals("M", result);
	}
}
