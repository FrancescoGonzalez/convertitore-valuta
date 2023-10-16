package org.gonzalez;

import org.junit.Test;

public class ValueConverterTest {

    private final ValueConverter converter = new ValueConverter();
    @Test
    public void eur2chfTest() {

        Double result = converter.convert(50, "EUR", "CHF");
        assert result.equals(Double.valueOf("47.52"));

    }

    @Test
    public void eur2chfSecondTest() {


        Double result = converter.convert(100, "EUR", "CHF");
        assert result.equals(Double.valueOf("95.05"));

    }

    @Test
    public void chf2eurTest() {

        Double result = converter.convert(50, "CHF", "EUR");
        assert result.equals(Double.valueOf("52.61"));
    }
}