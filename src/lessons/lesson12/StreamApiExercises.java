package lessons.lesson12;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiExercises {
    /*
    boolean containsEmptyString(Collection<String> strings) -
    true, если среди строк есть пустая
     */
    boolean containsEmptyString(Collection<String> strings) {
        return strings.stream()
                .anyMatch(s -> s.equals(""));
    }

    /*
    int countShortStrings(Set<String> strings, int maxLength)
    - возвращает число строк, длина которых больше maxLengths
     */
    int countShortStrings(Set<String> strings, int maxLength) {
        return (int) strings.stream()
                .filter(s -> s.length() <= maxLength)
                .count();
    }

    /*
    String findLongestString(Collection<String> strings) -
    возвращает самую длинную строку. если строк нет -
     выбрасывает IllegalArgumentException
     */
    String findLongestString(Collection<String> strings) throws IllegalArgumentException{
        return strings.stream()
                .max((s1, s2) -> s2.length() - s1.length())
                .orElseThrow(() -> {
                    throw new IllegalArgumentException();
                });
    }

    /*
    String getFirst(List<String> strings) -
    возвращает первую строку из коллекции. если строк нет - возвращает строку "kek"
     */
    String getFirst(List<String> strings) {
        return strings.stream()
                .findFirst()
                .orElse("kek");
    }

    /*
    List<Integer> lengths(List<String> strings) - возвращает список из длин строк
     */
    List<Integer> lengths(List<String> strings) {
        return strings.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
    }

    /*
    void printOddNumbers(Collection<Integer> numbers) -
    печатает нечётные числа, в столбик, отсортированные по убыванию
     */
    void printOddNumbers(Collection<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 1)
                .sorted((number1, number2) -> number2 - number1)
                .forEach(s -> System.out.println(s));
    }

    /*
    void printStringsStartingFrom(Collection<String> strings, int from) -
    печатает строки, начиная с номера from
     */
    void printStringsStartingFrom(Collection<String> strings, int from) {
        strings.stream()
                .skip(from)
                .forEach(string -> System.out.println(string));
    }

    /*
    List<Integer> duplicateEach(List<Integer> numbers) - возвращает список,
     где все элементы такие же, только по 2 раза подряд ([1, 2, 3] -> [1, 1, 2, 2, 3, 3])
     */
    List<Integer> duplicateEach(List<Integer> numbers) {
        return numbers.stream()
                .flatMap(p -> Stream.of(p, p))
                .collect(Collectors.toList());
    }

    /*
    List<Integer> incrementEach(List<Integer> numbers) - возвращает список,
    где каждый элемент такой же, только на 1 больше
     */
    List<Integer> incrementEach(List<Integer> numbers) {
        return numbers.stream()
                .peek(number -> number++)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        StreamApiExercises streamApiExercises = new StreamApiExercises();
        Collection<String> stringCollection = new ArrayList<>();
        String st1 = "First string";
        String st2 = "Second string";
        String st3 = "Third string";
        String st4 = "Four string";
        stringCollection.add(st1);
        stringCollection.add(st2);
        stringCollection.add(st3);
        stringCollection.add(st4);
        streamApiExercises.findLongestString(stringCollection);
    }
}



