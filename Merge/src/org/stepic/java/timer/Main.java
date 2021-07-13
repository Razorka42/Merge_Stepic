package org.stepic.java.timer;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        long time = timer.measureTime(() ->
                new BigDecimal("1234567").pow(100000));
        System.out.println(time);
    }
    //private static class BigDecimalPower implements Runnable {
    //@Override
    // public void run() {new BigDecimal("1234567").pow(100000); }
    // }
}
