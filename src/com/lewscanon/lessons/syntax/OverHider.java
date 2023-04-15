package com.lewscanon.lessons.syntax;

/** Show use of overridden interface methods. */
public class OverHider {
    interface OverHidden {
        /**
         * Transform a String.
         * @param subject String to transform.
         * @return transformed subject.
         */
        String transform(String subject);
    }

    interface OverHiding extends OverHidden {
        /**
         * Transform a String.
         * @param subject String to transform.
         * @return transformed subject.
         */
        @Override
        String transform(String subject);
    }

    /**
     * Exercise inherited interface methods.
     * @param args command arguments.
     */
    public static void main(String... args) {
        OverHidden hidden = subject -> subject == null ? null : subject.toUpperCase() + "-xformed";
        OverHiding hider = subject -> subject == null ? null : new StringBuilder(subject).reverse().toString();
        OverHidden overHider = hider;

        final String HIDER_FORMAT = "hider:  \t\"%s\" -> \"%s\"%n";
        final String OVER_HIDER_FORMAT = "overHider: \t\"%s\" -> \"%s\"%n";
        final String HIDDEN_FORMAT = "hidden: \t\"%s\" -> \"%s\"%n";

        System.out.printf(HIDDEN_FORMAT, "hidden", hidden.transform("hidden"));
        System.out.printf(HIDER_FORMAT, "hider", hider.transform("hider"));
        System.out.printf(OVER_HIDER_FORMAT, "overHider", overHider.transform("overHider"));
    }
}
