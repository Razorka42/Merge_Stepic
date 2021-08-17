package org.stepic.java;

import java.util.Objects;

public class Pair <T, X> {
    private final T first;
    private final X second;

    private Pair(T first, X second) {
        this.first = first;
        this.second = second;
    }

    public static <T, X> Pair of(T first, X second) {
        return new Pair<>(first, second);
    }

    public T getFirst() {
        return first;
    }

    public X getSecond() {
        return second;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
    }
    public int hashCode() {
        int result = 0;
        if (first == null) {
            result = (-1 + second.hashCode()*3);
        }
        if (second ==null) {
            result = (first.hashCode()*3 +1);
        }
        if (first != null && second != null) {
            result = (first.hashCode() + second.hashCode()) * 3;
        }
        return result;
    }



    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(null, "hello");
        Integer i = pair.getFirst(); // 1
        System.out.println("First = " + i);
        String s = pair.getSecond(); // "hello"
        System.out.println("Second = " + s);

        Pair<Integer, String> pair2 = Pair.of("hello", null);
        boolean mustBeTrue = pair.equals(pair2); // true!
        System.out.println(mustBeTrue);
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println(mustAlsoBeTrue);
    }




}
