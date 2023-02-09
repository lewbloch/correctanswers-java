package com.lewscanon.lessons.syntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/** Underscore in numerals. */
public class Underscorer {
    static final double EULEY = 2.7182818284590;
    static final double EULEY_SCORE_1 = 2.7_182818284590;
    static final double EULEY_SCORE_3 = 2.718_2818284590;
    static final double EULEY_SCORE_13 = 2.7_18_2818284590;
    static final double EULEY_SCORE_PU = 2_7.182818284590e-1;

//    static final double EULEY_SCORE_0 = 2._7182818284590;   // illegal underscore
//    static final double EULEY_SCORE_U = 2_.7182818284590;   // illegal underscore
//    static final double EULEY_SCORE_T = _2.7182818284590;   // ';' expected

    static final Map<String, Double> numerals = new TreeMap<>(Map.of(
            "EULER", Math.E,
            "EULEY", EULEY,
            "EULEY_SCORE_3", EULEY_SCORE_3,
            "EULEY_SCORE_1", EULEY_SCORE_1,
            "EULEY_SCORE_13", EULEY_SCORE_13,
            "EULEY_SCORE_PU", EULEY_SCORE_PU
    ));

    /**
     * Use the constants.
     * @param args Command arguments.
     */
    public static void main(String... args) {
        final String FORMAT = "%s: \t%.15f =~ ln(%.18f)%n";

        List<String> analyses = new ArrayList<>();
        for (Map.Entry<String, Double> numeral : numerals.entrySet()) {
            double value = numeral.getValue();
            double logn = Math.log(value);

            String line = String.format(FORMAT, numeral.getKey(), value, logn);
            analyses.add(line);
        }
        System.out.printf("Analyses: %n%s%n", analyses);
    }
}
