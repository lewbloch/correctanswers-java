package com.lewscanon.lessons.syntax;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Reveal the qualities of {@link HashMap}.
 */
public class HashMapQualities {
    private static final String NAME_A = "Alpha";
    private static final String NAME_B = "Beta";
    private static final String NAME_AB = "AlphaBeta";

    private static final String RETRIEVAL = "Retrieve %s: %s%n";

    /**
     * Reveal {@link HashMap} qualities.
     * @param args command arguments.
     */
    public static void main(String... args) {
        HashMap<Quality, String> qualities = new HashMap<>();

        WithoutEquals woeqAlpha = new WithoutEquals(NAME_A);
        WithoutEquals woeqBeta= new WithoutEquals(NAME_B);
        WithoutEquals woeqBetaDupe= new WithoutEquals(NAME_B);
        WithoutEquals woeqAlphaBeta = new WithoutEquals(NAME_AB);

        DegenerateEquals wodeAlpha = new DegenerateEquals(NAME_A);
        DegenerateEquals wodeBeta = new DegenerateEquals(NAME_B);
        DegenerateEquals wodeBetaDupe = new DegenerateEquals(NAME_B);
        DegenerateEquals wodeAlphaBeta = new DegenerateEquals(NAME_AB);

        NameBased wonbAlpha = new NameBased(NAME_A);
        NameBased wonbBeta = new NameBased(NAME_B);
        NameBased wonbBetaDupe = new NameBased(NAME_B);
        NameBased wonbAlphaBeta = new NameBased(NAME_AB);

        // WithoutEquals
        qualities.put(woeqAlpha, woeqAlpha.getName());
        qualities.put(woeqBeta, woeqBeta.getName());
        qualities.put(woeqBetaDupe, woeqBetaDupe.getName());
        qualities.put(woeqAlphaBeta, woeqAlphaBeta.getName());

        System.out.println();
        System.out.println(WithoutEquals.SCENARIO + ":\n" + qualities + ":");

        System.out.printf(RETRIEVAL, woeqAlpha, qualities.get(woeqAlpha));
        System.out.printf(RETRIEVAL, woeqBeta, qualities.get(woeqBeta));
        System.out.printf(RETRIEVAL, woeqBetaDupe, qualities.get(woeqBetaDupe));
        System.out.printf(RETRIEVAL, woeqAlphaBeta, qualities.get(woeqAlphaBeta));

        // DegenerateEquals
        qualities.clear();
        qualities.put(wodeAlpha, wodeAlpha.getName());
        qualities.put(wodeBeta, wodeBeta.getName());
        qualities.put(wodeBetaDupe, wodeBetaDupe.getName());
        qualities.put(wodeAlphaBeta, wodeAlphaBeta.getName());

        System.out.println();
        System.out.println(DegenerateEquals.SCENARIO + ":\n" + qualities + ":");
        System.out.printf(RETRIEVAL, wodeAlpha, qualities.get(wodeAlpha));
        System.out.printf(RETRIEVAL, wodeBeta, qualities.get(wodeBeta));
        System.out.printf(RETRIEVAL, wodeBetaDupe, qualities.get(wodeBetaDupe));
        System.out.printf(RETRIEVAL, wodeAlphaBeta, qualities.get(wodeAlphaBeta));

        // NameBased
        qualities.clear();

        qualities.put(wonbAlpha, wonbAlpha.getName());
        qualities.put(wonbBeta, wonbBeta.getName());
        qualities.put(wonbBetaDupe, wonbBetaDupe.getName());
        qualities.put(wonbAlphaBeta, wonbAlphaBeta.getName());

        System.out.println();
        System.out.println(NameBased.SCENARIO + "\n" + qualities + ":");
        System.out.printf(RETRIEVAL, wonbAlpha, qualities.get(wonbAlpha));
        System.out.printf(RETRIEVAL, wonbBeta, qualities.get(wonbBeta));
        System.out.printf(RETRIEVAL, wonbBetaDupe, qualities.get(wonbBetaDupe));
        System.out.printf(RETRIEVAL, wonbAlphaBeta, qualities.get(wonbAlphaBeta));

        // mixed
        qualities.clear();

        qualities.put(woeqAlpha, woeqAlpha.getName());
        qualities.put(wodeAlpha, wodeAlpha.getName());
        qualities.put(wonbAlpha, wonbAlpha.getName());

        qualities.put(wodeBeta, wodeBeta.getName());
        qualities.put(wonbBeta, wonbBeta.getName());
        qualities.put(woeqBeta, woeqBeta.getName());

        qualities.put(wodeBetaDupe, wodeBetaDupe.getName());
        qualities.put(wonbBetaDupe, wonbBetaDupe.getName());
        qualities.put(woeqBetaDupe, woeqBetaDupe.getName());

        qualities.put(wonbAlphaBeta, wonbAlphaBeta.getName());
        qualities.put(woeqAlphaBeta, woeqAlphaBeta.getName());
        qualities.put(wodeAlphaBeta, wodeAlphaBeta.getName());

        System.out.println();
        System.out.println(WithoutEquals.SCENARIO
                + "\nplus " + DegenerateEquals.SCENARIO + "\nplus " + NameBased.SCENARIO+ "\n"
                + qualities + ":");

        System.out.printf(RETRIEVAL, woeqAlpha, qualities.get(woeqAlpha));
        System.out.printf(RETRIEVAL, wodeAlpha, qualities.get(wodeAlpha));
        System.out.printf(RETRIEVAL, wonbAlpha, qualities.get(wonbAlpha));

        System.out.printf(RETRIEVAL, woeqBeta, qualities.get(woeqBeta));
        System.out.printf(RETRIEVAL, wodeBeta, qualities.get(wodeBeta));
        System.out.printf(RETRIEVAL, wonbBeta, qualities.get(wonbBeta));

        System.out.printf(RETRIEVAL, woeqBetaDupe, qualities.get(woeqBetaDupe));
        System.out.printf(RETRIEVAL, wodeBetaDupe, qualities.get(wodeBetaDupe));
        System.out.printf(RETRIEVAL, wonbBetaDupe, qualities.get(wonbBetaDupe));

        System.out.printf(RETRIEVAL, woeqAlphaBeta, qualities.get(woeqAlphaBeta));
        System.out.printf(RETRIEVAL, wodeAlphaBeta, qualities.get(wodeAlphaBeta));
        System.out.printf(RETRIEVAL, wonbAlphaBeta, qualities.get(wonbAlphaBeta));
    }
}

abstract class Quality {
    private static final AtomicInteger counter = new AtomicInteger(0);

    private final String name;
    private final String repr;

    /**
     * Constructor with name.
     * @param name identifier.
     */
    protected Quality(String name) {
        this.name = name;
        this.repr = this.getClass().getSimpleName() + '.' + this.name + '#' + counter.getAndIncrement();
    }

    @Override
    public String toString() {
        return this.repr;
    }

    /**
     * Get the name.
     * @return the name.
     */
    public String getName() {
        return name;
    }
}

/** Key with degenerate {@code hashCode()} and no {@code equals()} override. */
class WithoutEquals extends Quality {
    /** Scenario. */
    public static final String SCENARIO = "degenerate hashCode(), default equals()";

    /**
     * Constructor with name.
     * @param name identifier.
     */
    public WithoutEquals(String name) {
        super(name);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}

/** Key with degenerate {@code hashCode()} and no {@code equals()} override. */
class DegenerateEquals extends Quality {
    /** Scenario. */
    public static final String SCENARIO = "degenerate hashCode(), degenerate equals()";

    /**
     * Constructor with name.
     * @param name identifier.
     */
    public DegenerateEquals(String name) {
        super(name);
    }

    @Override
    public int hashCode() {
        return 2;
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Quality;
    }
}

/** Key with name-based {@code hashCode()} and {@code equals()} overrides. */
class NameBased extends Quality {
    /** Scenario. */
    public static final String SCENARIO = "name-based hashCode(), name-based equals()";

    /**
     * Constructor with name.
     * @param name identifier.
     */
    public NameBased(String name) {
        super(name);
    }

    @Override
    public int hashCode() {
        return getName() == null? 0 : getName().hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof NameBased otherNameBased) {
            return this.getName() == null ?  otherNameBased.getName() == null
                    :  this.getName().equals(otherNameBased.getName());
        }
        else {
            return false;
        }
    }
}
