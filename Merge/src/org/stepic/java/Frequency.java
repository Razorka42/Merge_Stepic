package org.stepic.java;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


public class Frequency {
    public static void main(String[] args) throws IOException {
        List<String> listOfWords = new ArrayList<>();
        List<String> listOfWordsBeforeFilter = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();

        String[] words = string.toLowerCase().split("[^A-Za-zА-Яа-я0-9]|\\s");
        listOfWordsBeforeFilter = Arrays.asList(words);
        listOfWords = listOfWordsBeforeFilter.stream().filter(s -> !s.equals("")).collect(Collectors.toList());

        Map<String, Integer> mapOfWords = new TreeMap<>();

        Set<String> setOfWords = new HashSet<>(listOfWords);
        Iterator<String> iterator = setOfWords.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            Integer frequency = Collections.frequency(listOfWords, word);
            mapOfWords.put(word, frequency);
        }
        Map<String, Integer> sortedMap = mapOfWords.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(10).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        sortedMap.keySet().stream().forEach(System.out::println);

    }

}

