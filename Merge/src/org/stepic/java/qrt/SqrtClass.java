package org.stepic.java.qrt;

public class SqrtClass {
    public static double sqrt(double x) throws IllegalArgumentException {
        if (x >= 0) {
            return Math.sqrt(x);
        }
        throw new java.lang.IllegalArgumentException(
                "Expected non-negative number, got " + x);


    }
}
