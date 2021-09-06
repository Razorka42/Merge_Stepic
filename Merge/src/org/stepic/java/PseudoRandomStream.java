package org.stepic.java;

import java.util.stream.IntStream;

public class PseudoRandomStream {
    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, x -> ((x * x) % 10000) / 10); // your implementation here
    }

    public static void main(String[] args) {
       IntStream res = pseudoRandomStream(13);
       res.limit(10)
               .forEach(System.out::println);
    }
}
