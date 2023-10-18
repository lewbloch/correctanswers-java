package com.lewscanon.lessons.novelties;

public class MutableString implements Appendable, CharSequence, Comparable<MutableString> {
    private final StringBuilder builder;

    /**
     * Constructor with empty initial value.
     */
    @SuppressWarnings("unused")
    public MutableString() {
        this.builder = new StringBuilder();
    }

    /**
     * Copy constructor.
     * @param initial inital value.
     */
    public MutableString(MutableString initial) {
        this.builder = initial == null ? new StringBuilder() : new StringBuilder(initial.builder);
    }

    /**
     * Constructor with initial value.
     * @param initial inital value.
     */
    public MutableString(CharSequence initial) {
        this.builder = initial == null ? new StringBuilder() : new StringBuilder(initial);
    }

    /**
     * Append a copy to the value within the instance.
     * @param augend Value to append.
     * @return this instance (Builder pattern).
     */
    @SuppressWarnings("unused")
    public MutableString append(MutableString augend) {
        return augend == null ? this : append(augend.builder);
    }

    /**
     * Append a copy to the value within the instance.
     * @param augend Value to append.
     * @return this instance (Builder pattern).
     */
    public MutableString append(CharSequence augend) {
        if (augend != null) {
            builder.append(augend);
        }
        return this;
    }

    @SuppressWarnings("unused")
    public MutableString append(MutableString augend, int start, int end) {
        if (augend != null) {
            builder.append(augend.builder, start, end);
        }
        return this;
    }

    @Override
    public MutableString append(CharSequence augend, int start, int end) {
        if (augend != null) {
            builder.append(augend, start, end);
        }
        return this;
    }

    @Override
    public Appendable append(char c) {
        this.builder.append(c);
        return this;
    }

    /**
     * Concatenate a copy to the value into a new instance.
     * @param augend Value to append.
     * @return new instance.
     */
    @SuppressWarnings("unused")
    public MutableString concat(MutableString augend) {
        return augend == null ? new MutableString(this) : concat(augend.builder);
    }

    /**
     * Concatenate a copy to the value into a new instance.
     * @param augend Value to append.
     * @return new instance.
     */
    public MutableString concat(CharSequence augend) {
        if (augend == null) {
            return new MutableString(this);
        }

        @SuppressWarnings("UnnecessaryLocalVariable")
        final MutableString retval = new MutableString(new StringBuilder(this.builder).append(augend));
        return retval;
    }

    @Override
    public int length() {
        return builder.length();
    }

    @Override
    public char charAt(int index) {
        return builder.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return builder.subSequence(start, end);
    }

    @Override public boolean equals(Object another) {
        return another instanceof MutableString other && this.builder.compareTo(other.builder) == 0;
    }

    @Override
    public int compareTo(MutableString other) {
        return other == null ? 1 : this.builder.compareTo(other.builder);
    }

    @Override
    public int hashCode() {
        return builder.hashCode();
    }

    @Override
    public String toString() {
        return builder.toString();
    }

    /**
     * Main method to test the logic.
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        final String OUTF = "%s \t=> \"%s\"%n";

        final MutableString mutableString = new MutableString("Java");
        System.out.printf(OUTF, "constructor(String)", mutableString);

        final String augend = " programming";
        mutableString.concat(augend);
        System.out.printf(OUTF, "concat(String)     ", mutableString);

        mutableString.append(augend);
        System.out.printf(OUTF, "append(String)     ", mutableString);

        final MutableString copyable = new MutableString("information:");
        System.out.printf(OUTF, "constructor(String)", copyable);
        copyable.append(" name and");
        System.out.printf(OUTF, "append(String)     ", copyable);

        final MutableString copied = copyable.append(new MutableString(" address"));
        System.out.printf(OUTF, "append(Mutable)    ", copyable);
        System.out.printf(OUTF, "copied             ", copied);

        copied.append(", phone");
        System.out.printf(OUTF, "copied             ", copied);
        System.out.printf(OUTF, "copyable           ", copyable);
        System.out.printf(OUTF, "copyable.append(null)", copyable.append(null));
        System.out.printf(OUTF, "((CharSequence) null)", copyable.append((CharSequence) null));
    }
}
