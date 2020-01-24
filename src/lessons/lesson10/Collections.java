package lessons.lesson10;

import static lessons.lesson7.StringUtils.isPalindrome;

import java.util.*;
import java.util.stream.Stream;

public class Collections<T extends Object> {
    /*
    Создайте метод getPalindroms(Collection<String> words), который будет возвращать HashSet из палиндромов.
     */
    HashSet getPalindromes(Collection<String> words) {
        HashSet<String> hashSetPalindromes = new HashSet<>();
        for (String s : words) {
            if (isPalindrome(s)) {
                hashSetPalindromes.add(s);
            }
        }
        return hashSetPalindromes;
    }

    /*
    Создайте generic метод createArrayList(T... elements), который будет возвращать ArrayList с элементами elements.
     */
    ArrayList createArrayList(T... elements) {
        ArrayList<T> elementsList = new ArrayList<>();
        for (T t : elements) {
            elementsList.add(t);
        }
        return elementsList;
    }

    /*
    Создайте метод, который будет принимать ArrayList и возвращать ArrayList с теми же элементами в случайном порядке
     */
    static ArrayList randomArrayList(ArrayList list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size() + i; i++) {
            int random = (int) (Math.random() * (list.size()));
            arrayList.add(list.get(random));
            list.remove(random);
        }
        return arrayList;
    }

    /*
    Создайте метод char findMostFrequentChar(String s), который будет искать самый часто встречающийся символ в строке
     */
    static char findMostFrequentChar(String s) {
        char[] arrayChar = s.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : arrayChar) {
            if (hashMap.containsKey(c)) {
                int key = hashMap.get(c);
                hashMap.put(c, ++key);
            } else {
                hashMap.put(c, 1);
            }
        }
        System.out.println(hashMap.values());
        System.out.println(hashMap.keySet());
        TreeSet<Integer> integers = new TreeSet<>(hashMap.values());
        Character mostFrequent = null;
        for (Map.Entry<Character, Integer> pair : hashMap.entrySet()) {
            if (integers.last().equals(pair.getValue())) {
                mostFrequent = pair.getKey();
            }
        }
        return mostFrequent;
    }


    /*
    Создайте метод sort(List<String>), который будет сортировать строки по длине,
    а если длина одинаковая - лексикографически. Он должен возвращать ArrayList
     */
    public static void main(String[] args) {
        ArrayList<String> stringCollection = new ArrayList<>();
        String st1 = "Firsstss strssing";
        String st2 = "Second string";
        String st3 = "Third string";
        String st4 = "Four string";
        stringCollection.add(st1);
        stringCollection.add(st2);
        stringCollection.add(st3);
        stringCollection.add(st4);
        System.out.println(randomArrayList(stringCollection));
        System.out.println(findMostFrequentChar(st1));
    }
}
