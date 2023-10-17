package org.gonzalez;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValueConverterTest {

    private final ValueConverter converter = new ValueConverter();
    @Test
    public void eur2chfTest() {

        Currency result = converter.convert(50, "EUR", "CHF", 1.0, 1.0528);
        assertEquals(new Currency("CHF", 47.49, 1.0528).toString(), result.toString());

    }

    @Test
    public void eur2chfSecondTest() {


        Currency result = converter.convert(100, "EUR", "CHF", 1.0, 1.0528);
        assertEquals(new Currency("CHF", 94.98, 1.0528).toString(), result.toString());

    }

    @Test
    public void chf2eurTest() {

        Currency result = converter.convert(50, "CHF", "EUR", 1.0528, 1.0);
        assertEquals(new Currency("EUR", 52.64, 1.0).toString(), result.toString());
    }
}