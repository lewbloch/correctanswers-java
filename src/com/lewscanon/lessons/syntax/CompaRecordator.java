package com.lewscanon.lessons.syntax;

/**
 * Correct overrides for value equality.
 */
public record CompaRecordator(String state) {

    /**
     * Constructor with state.
     *
     * @param state state.
     */
    public CompaRecordator {
        if (state == null) {
            throw new IllegalArgumentException(new NullPointerException("null state"));
        }
    }

    /**
     * Get the state.
     *
     * @return the state.
     */
    @Override
    public String state() {
        return state;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CompaRecordator otherComp)) {
            return false;
        }
        assert this.state() != null && otherComp.state() != null;

        @SuppressWarnings("UnnecessaryLocalVariable")
        var isEqual = this.state().equals(otherComp.state());
        return isEqual;
    }

    @Override
    public String toString() {
        return this.state;
    }

    /**
     * Main routine.
     *
     * @param args Command arguments.
     */
    public static void main(String... args) {
        var comparFirst = new CompaRecordator("First");
        var comparFirstish = new CompaRecordator("First");
        var comparSecond = new CompaRecordator("Second");

        System.out.println("comparFirst.equals(comparFirstish)? " + comparFirst.equals(comparFirstish));
        System.out.println("comparFirst.equals(comparSecond)? " + comparFirst.equals(comparSecond));
        System.out.println("comparSecond.equals(comparFirstish)? " + comparSecond.equals(comparFirstish));
    }
}
