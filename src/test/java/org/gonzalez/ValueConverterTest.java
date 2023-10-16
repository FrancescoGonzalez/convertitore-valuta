package org.gonzalez;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValueConverterTest {

    private final ValueConverter converter = new ValueConverter();
    @Test
    public void eur2chfTest() {

        Double result = converter.convert(50, "EUR", "CHF");
        assertEquals(result, Double.valueOf("47.495"));

    }

    @Test
    public void eur2chfSecondTest() {


        Double result = converter.convert(100, "EUR", "CHF");
        assertEquals(result, Double.valueOf("94.99"));

    }

    @Test
    public void chf2eurTest() {

        Double result = converter.convert(50, "CHF", "EUR");
        assertEquals(result, Double.valueOf("52.64"));
    }
}