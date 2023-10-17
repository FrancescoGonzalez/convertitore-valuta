package org.gonzalez;

public class ValueConverter {
    public Currency convert(double i, String v1, String v2, Double r1, Double r2) {
        return new Currency(v1, i, r1).convert(new Currency(v2, null, r2));
    }

    public Double getRate(String v1, String v2) {
        if (v1.equals("EUR") && v2.equals("CHF")) return 0.9499;
        if (v1.equals("CHF") && v2.equals("EUR")) return 1.0528;
        return null;
    }
}
