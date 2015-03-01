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

	@Test
	public void given1001getMI() {
		String result = converter.convert(1001);
		Assert.assertEquals("MI", result);
	}

	@Test
	public void given2000getMM() {
		String result = converter.convert(2000);
		Assert.assertEquals("MM", result);
	}

	@Test
	public void given2015getMMXV() {
		String result = converter.convert(2015);
		Assert.assertEquals("MMXV", result);
	}
}
