package org.stepic.java;

import java.io.IOException;

public class Hack {
    public static void main(String[] args) {
        throwAsUncheked(new IOException());
    }
    private static void throwAsUncheked(Exception e) {
        Hack.<RuntimeException>genericThrow(e);
    }
    private static <T extends  Throwable> void  genericThrow(Exception e) throws  T {
        throw (T) e;
    }
}
