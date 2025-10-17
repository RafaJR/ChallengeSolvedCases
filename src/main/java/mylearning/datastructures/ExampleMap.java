package mylearning.datastructures;

import java.util.*;

public class ExampleMap {

    private static final int defaultFrequency = 0;

    public static void main(String[] args) {

    }

    public static int getFrequency(Map<String, Integer> freq, String word) {

        return (freq == null || word == null || word.isBlank()) ? defaultFrequency :
                freq.getOrDefault(word.toLowerCase(Locale.ROOT), defaultFrequency);

    }

    public static Map<String, Integer> countFrequencies(List<String> words) {

        var strFrequencies = new HashMap<String, Integer>(); // Inferencia de tipos: el compilador infiere que es un Map<String, Integer>

        if (words != null && !words.isEmpty()) {

            words.stream()// No parrallellStream allowed becasue is not thread-safe, so can cause conflicts when merge
                    .filter(word -> word != null && !word.isBlank())
                    .map(word -> word.toLowerCase(Locale.ROOT)).forEach(
                            word -> {
                                strFrequencies.merge(word, 1, Integer::sum);
                            });

        }

        return strFrequencies;
    }

    public static Optional<String> mostFrequent(Map<String, Integer> freq) {

        if (freq == null || freq.isEmpty()) {
            return Optional.empty();
        }

        return freq.entrySet().stream()
                .max(Comparator.comparing(Map.Entry<String, Integer>::getValue)
                        .thenComparing(Map.Entry::getKey))
                .map(Map.Entry::getKey);

    }

}
