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

	@Test
	public void given12getXII() {
		String result = converter.convert(12);
		Assert.assertEquals("XII", result);
	}

	@Test
	public void given13getXIII() {
		String result = converter.convert(13);
		Assert.assertEquals("XIII", result);
	}

	@Test
	public void given14getXIV() {
		String result = converter.convert(14);
		Assert.assertEquals("XIV", result);
	}

	@Test
	public void given15getXV() {
		String result = converter.convert(15);
		Assert.assertEquals("XV", result);
	}

	@Test
	public void given16getXVI() {
		String result = converter.convert(16);
		Assert.assertEquals("XVI", result);
	}

	@Test
	public void given19getXIX() {
		String result = converter.convert(19);
		Assert.assertEquals("XIX", result);
	}

	@Test
	public void given20getXX() {
		String result = converter.convert(20);
		Assert.assertEquals("XX", result);
	}

	@Test
	public void given21getXXI() {
		String result = converter.convert(21);
		Assert.assertEquals("XXI", result);
	}

	@Test
	public void given24getXXI() {
		String result = converter.convert(24);
		Assert.assertEquals("XXIV", result);
	}

	@Test
	public void given26getXXI() {
		String result = converter.convert(26);
		Assert.assertEquals("XXVI", result);
	}

	@Test
	public void given29getXXIX() {
		String result = converter.convert(29);
		Assert.assertEquals("XXIX", result);
	}

	@Test
	public void given30getXXX() {
		String result = converter.convert(30);
		Assert.assertEquals("XXX", result);
	}

	@Test
	public void given34getXXX() {
		String result = converter.convert(34);
		Assert.assertEquals("XXXIV", result);
	}

	@Test
	public void given39getXXXIX() {
		String result = converter.convert(39);
		Assert.assertEquals("XXXIX", result);
	}

	@Test
	public void given40getXL() {
		String result = converter.convert(40);
		Assert.assertEquals("XL", result);
	}

	@Test
	public void given41getXLI() {
		String result = converter.convert(41);
		Assert.assertEquals("XLI", result);
	}

	@Test
	public void given41getXLIV() {
		String result = converter.convert(44);
		Assert.assertEquals("XLIV", result);
	}

	@Test
	public void given49getXLIX() {
		String result = converter.convert(49);
		Assert.assertEquals("XLIX", result);
	}

	@Test
	public void given50getL() {
		String result = converter.convert(50);
		Assert.assertEquals("L", result);
	}

	@Test
	public void given51getLI() {
		String result = converter.convert(51);
		Assert.assertEquals("LI", result);
	}

	@Test
	public void given54getLIV() {
		String result = converter.convert(54);
		Assert.assertEquals("LIV", result);
	}

	@Test
	public void given59getLIX() {
		String result = converter.convert(59);
		Assert.assertEquals("LIX", result);
	}

	@Test
	public void given60getLX() {
		String result = converter.convert(60);
		Assert.assertEquals("LX", result);
	}
}