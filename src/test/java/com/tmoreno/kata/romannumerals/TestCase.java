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
}