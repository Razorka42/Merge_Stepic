package org.stepic.java;

import java.util.*;

public class SymmetricDifference {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> newSet = new HashSet<>();
        if (set1 == null || set2 == null) {
            System.out.println("Невозможно вычислить разницу");
            return newSet;
        }
        if (set1 == set2) {
            return newSet;
        }
        Iterator<? extends T> iterator1 = set1.iterator();
        Iterator<? extends T> iterator2 = set2.iterator();
        while (iterator1.hasNext()) {
            T element1 = iterator1.next();

            if (!set2.contains(element1)) {
                newSet.add(element1);
            }

        }
        while (iterator2.hasNext()) {
            T element2 = iterator2.next();
            if (!set1.contains(element2)) {
                newSet.add(element2);
            }
        }
        return newSet;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        Set<Integer> set3 = symmetricDifference(set1, set2);
        for (Integer element : set3) {
            System.out.println(element);
        }
    }
}

//import java.util.Scanner;



