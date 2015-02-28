package com.tmoreno.kata.romannumerals;

import org.junit.Assert;
import org.junit.Test;

public class TestCase {

    @Test
    public void given1getI() {
        DecimalToRomanConverter converter = new DecimalToRomanConverter();
        String result = converter.convert(1);
        Assert.assertEquals("I", result);
    }
}