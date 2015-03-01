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
	public void given100getC() {
		String result = converter.convert(100);
		Assert.assertEquals("C", result);
	}

	@Test
	public void given101getC() {
		String result = converter.convert(101);
		Assert.assertEquals("CI", result);
	}

	@Test
	public void given104getC() {
		String result = converter.convert(104);
		Assert.assertEquals("CIV", result);
	}

	@Test
	public void given110getCX() {
		String result = converter.convert(110);
		Assert.assertEquals("CX", result);
	}

	@Test
	public void given110getCXI() {
		String result = converter.convert(111);
		Assert.assertEquals("CXI", result);
	}

	@Test
	public void given140getCXL() {
		String result = converter.convert(140);
		Assert.assertEquals("CXL", result);
	}

	@Test
	public void given199getCXCIX() {
		String result = converter.convert(199);
		Assert.assertEquals("CXCIX", result);
	}

	@Test
	public void given200getCC() {
		String result = converter.convert(200);
		Assert.assertEquals("CC", result);
	}

	@Test
	public void given400getCD() {
		String result = converter.convert(400);
		Assert.assertEquals("CD", result);
	}

	@Test
	public void given499getCDXCIX() {
		String result = converter.convert(499);
		Assert.assertEquals("CDXCIX", result);
	}

	@Test
	public void given500getD() {
		String result = converter.convert(500);
		Assert.assertEquals("D", result);
	}

	@Test
	public void given600getD() {
		String result = converter.convert(600);
		Assert.assertEquals("DC", result);
	}

	@Test
	public void given900getD() {
		String result = converter.convert(900);
		Assert.assertEquals("CM", result);
	}

	@Test
	public void given999getD() {
		String result = converter.convert(999);
		Assert.assertEquals("CMXCIX", result);
	}
}
