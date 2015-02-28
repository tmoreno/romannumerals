package com.tmoreno.kata.romannumerals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCase {

	private DecimalToRomanConverter converter;

	@Before
	public void init() {
		converter = new DecimalToRomanConverter();
	}

	@Test
	public void given1getI() {
		String result = converter.convert(1);
		Assert.assertEquals("I", result);
	}

	@Test
	public void given2getII() {
		String result = converter.convert(2);
		Assert.assertEquals("II", result);
	}

	@Test
	public void given3getIII() {
		String result = converter.convert(3);
		Assert.assertEquals("III", result);
	}

	@Test
	public void given4getIV() {
		String result = converter.convert(4);
		Assert.assertEquals("IV", result);
	}

	@Test
	public void given5getV() {
		String result = converter.convert(5);
		Assert.assertEquals("V", result);
	}

	@Test
	public void given6getVI() {
		String result = converter.convert(6);
		Assert.assertEquals("VI", result);
	}

	@Test
	public void given7getVII() {
		String result = converter.convert(7);
		Assert.assertEquals("VII", result);
	}

	@Test
	public void given8getVIII() {
		String result = converter.convert(8);
		Assert.assertEquals("VIII", result);
	}

	@Test
	public void given9getIX() {
		String result = converter.convert(9);
		Assert.assertEquals("IX", result);
	}

	@Test
	public void given10getX() {
		String result = converter.convert(10);
		Assert.assertEquals("X", result);
	}

	@Test
	public void given11getXI() {
		String result = converter.convert(11);
		Assert.assertEquals("XI", result);
	}
}