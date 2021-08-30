package org.stepic.java;

import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfIntegers = new ArrayList<>();
        while (scanner.hasNextInt()) {
            Integer element = scanner.nextInt();
            if (element == -111) {
                break;
            }
            listOfIntegers.add(element);

        }
        List<Integer> newListOfIntegers = new ArrayList<>();
        for (int i = 0; i < listOfIntegers.size(); i++) {
            if (i % 2 != 0) {
                Integer element = listOfIntegers.get(i);
                newListOfIntegers.add(element);
            }
        }
        Collections.reverse(newListOfIntegers);
        for (Integer element : newListOfIntegers) {
            System.out.print(element + " ");
        }
    }

}
