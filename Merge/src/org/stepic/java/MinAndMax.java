package org.stepic.java;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinAndMax {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of();
        BiConsumer<String, String> cons = new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {

                System.out.println(s);

                System.out.println(s2);
            }
        };
        findMinMax(stream, Comparator.comparing(String::length), cons);


    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> streamList = stream.collect(Collectors.toList());
        Iterator it = streamList.iterator();
        if (it.hasNext()) {
            streamList.sort(order);
            T min = streamList.get(0);
            T max = streamList.get((streamList.size() - 1));
            minMaxConsumer.accept(min, max);
        } else {
            minMaxConsumer.accept(null, null);
        }


    }


}

