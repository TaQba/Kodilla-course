package com.kodilla.patterns.builder.bigmac;

public final class BreadFactory {
    public static final String BUN="BUN";
    public static final String ROLL="ROLL";

    public static Bread takeBreak(String type, boolean hasSeed) {
        if (type.equals(BUN)) {
            return new Bun("Bun", hasSeed);
        } else if (type.equals(ROLL)) {
            return new Bun("Roll", hasSeed);
        } else {
            throw new IllegalStateException("Type of bread should be Bun or Roll");
        }
    }
}