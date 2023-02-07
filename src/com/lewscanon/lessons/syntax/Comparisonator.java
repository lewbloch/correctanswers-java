package com.lewscanon.lessons.syntax;

/** Correct overrides for value equality. */
@SuppressWarnings("ClassCanBeRecord")
public class Comparisonator {

    private final String state;

    /**
     * Constructor with state.
     * @param state state.
     */
    public Comparisonator(String state) {
        if (state == null) {
            throw new IllegalArgumentException(new NullPointerException("null state"));
        }
        this.state = state;
    }

    /**
     * Get the state.
     * @return the state.
     */
    public String getState() {
        return state;
    }

    @Override
    public boolean equals(Object other) {
        if (! (other instanceof Comparisonator otherComp)) {
            return false;
        }
        assert this.getState() != null && otherComp.getState() != null;

        @SuppressWarnings("UnnecessaryLocalVariable")
        var isEqual = this.getState().equals(otherComp.getState());
        return isEqual;
    }

    @Override
    public int hashCode() {
        return this.state.hashCode();
    }

    @Override
    public String toString() {
        return this.state;
    }

    /**
     * Main routine.
     * @param args Command arguments.
     */
    public static void main(String... args) {
        Comparisonator comparFirst = new Comparisonator("First");
        Comparisonator comparFirstish = new Comparisonator("First");
        Comparisonator comparSecond = new Comparisonator("Second");

        System.out.println("comparFirst.equals(comparFirstish)? " + comparFirst.equals(comparFirstish));
        System.out.println("comparFirst.equals(comparSecond)? " + comparFirst.equals(comparSecond));
        System.out.println("comparSecond.equals(comparFirstish)? " + comparSecond.equals(comparFirstish));
    }
}
