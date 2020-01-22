package lessons.lesson12;

import java.util.*;

public class StreamApiExercises {

    boolean containsEmptyString(Collection<String> strings) {
        return strings.stream()
                .anyMatch(s -> s.equalsIgnoreCase(""));
    }

    int countShortStrings(Set<String> strings, int maxLength) {
        List<String> strings1 = new ArrayList<>();
        strings.stream()
                .
    }

    String findLongestString(Collection<String> strings) throws IllegalArgumentException {
            return strings.stream()
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .orElseThrow(() -> {
                        throw new IllegalArgumentException();
                    });
        }
    }
}
