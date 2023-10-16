package org.gonzalez;

public class ValueConverter {
    public Double convert(double i, String v1, String v2) {
        return i * getRate(v1, v2);
    }

    public Double getRate(String v1, String v2) {
        if (v1.equals("EUR") && v2.equals("CHF")) return 0.9499;
        if (v1.equals("CHF") && v2.equals("EUR")) return 1.0528;
        return null;
    }
}
