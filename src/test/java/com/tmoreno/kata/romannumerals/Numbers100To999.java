package com.tmoreno.kata.romannumerals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Numbers100To999 {

	private DecimalToRomanConverter converter;

	@Before
	public void init() {
		converter = new DecimalToRomanConverter();
	}

	@Test
	public void given100getX() {
		String result = converter.convert(100);
		Assert.assertEquals("C", result);
	}
}
