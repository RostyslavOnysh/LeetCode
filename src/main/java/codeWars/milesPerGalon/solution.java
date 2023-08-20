package codeWars.milesPerGalon;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class solution {
    private static final double GALLON_TO_LITER = 4.54609188;
    private static final double MILE_TO_KM = 1.609344;

    public static float mpgToKPM(final float mpg) {  // number of miles per imperial gallon
        return BigDecimal.valueOf((MILE_TO_KM / GALLON_TO_LITER) * mpg)
                .setScale(2, RoundingMode.HALF_UP)
                .floatValue();
    }

    public static void main(String[] args) {
        float mpg = 35.0f;
        float kpl = mpgToKPM(mpg);
        System.out.println(mpg + " mpg is approximately " + kpl + " kpl");
    }
}

/*
Some useful associations relevant to this kata:

1 Imperial Gallon = 4.54609188 litres
1 Mile = 1.609344 kilometres

 */