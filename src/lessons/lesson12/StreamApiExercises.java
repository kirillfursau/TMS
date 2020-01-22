package lessons.lesson12;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiExercises {

    boolean containsEmptyString(Collection<String> strings) {
        return strings.stream()
                .anyMatch(s -> s.equalsIgnoreCase(""));
    }

    int countShortStrings(Set<String> strings, int maxLength) {
        return (int) strings.stream()
                .filter(s -> s.length() < maxLength)
                .count();
    }

    String findLongestString(Collection<String> strings) throws IllegalArgumentException {
        return strings.stream()
                .sorted((s1, s2) -> s2.length() - s1.length())
                .findFirst()
                .orElseThrow(() -> {
                    throw new IllegalArgumentException();
                });
    }

    String getFirst(List<String> strings) {
        return strings.stream()
                .findFirst()
                .orElse("kek");
    }

    List<Integer> lengths(List<String> strings) {
        return strings.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
    }

    void printOddNumbers(Collection<Integer> numbers) {
        System.out.println(numbers.stream()
                .filter(number -> number % 2 == 1)
                .sorted((number1, number2) -> number2 - number1));
    }

    void printStringsStartingFrom(Collection<String> strings, int from) {
        strings.stream()
                .skip(from)
                .forEach(string -> System.out.println(string));
    }

    List<Integer> incrementEach(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> number++)
                .collect(Collectors.toList());
    }
}

