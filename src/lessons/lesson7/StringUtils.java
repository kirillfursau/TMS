package lessons.lesson7;

public class StringUtils {
    public static int countCharacterEntries(String s, char c) {
        int coutEntries = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == c)) {
                coutEntries++;
            }
        }
        return coutEntries;
    }

    public static boolean startsWithDigit(String s) {
        boolean startsWithDigit = false;
        for (int i = 0; i < 10; i++) {
            if (s.startsWith("" + i)) {
                startsWithDigit = true;
                break;
            }
        }
        return startsWithDigit;
    }

    public static String findLongest(String... strings) {
        String longest = strings[0];
        for (int i = 0; i < strings.length; i++) {
            if (longest.length() < strings[i].length()) {
                longest = strings[i];
            }
        }
        return longest;
    }

    public static String kek(String s) {
        return s.replace("kek", "lol");
    }

    public static String unkek(String s) {
        return s.replace("kek", "");
    }

    public static int[] count20(String s) {
        int index = 0;
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            s.indexOf("20", index);
            index = s.indexOf("20", index) + 1;
            counter++;
            if (s.indexOf("20", index) == -1) {
                break;
            }
        }
        index = 0;
        int[] count20 = new int[counter];
        for (int i = 0; i < count20.length; i++) {
            count20[i] = s.indexOf("20", index);
            index = count20[i] + 1;
        }
        return count20;
    }

    public static char findMostFrequentChar(String s) {
        char[] arrayChar = s.toCharArray();
        char mostFrequent = arrayChar[0];
        int counter = 0;
        int mostCounter = 0;
        for (int i = 0; i < arrayChar.length; i++) {
            char current = arrayChar[i];
            counter = 1;
            for (int j = 0; j < arrayChar.length; j++) {
                if (current == arrayChar[j]) {
                    counter++;
                }
            }
            if (mostCounter < counter) {
                mostCounter = counter;
                mostFrequent = arrayChar[i];
            }
        }

        return mostFrequent;
    }

    public static char findFirstNonRepeating(String s) {
        char[] arrayChar = s.toCharArray();
        char firstNonRepeating = arrayChar[0];
        for (int i = 0; i < arrayChar.length; i++) {
            boolean repeat = false;
            for (int j = 0; j < arrayChar.length; j++) {
                if (arrayChar[i] == arrayChar[j] && i != j) {
                    repeat = true;
                    break;
                }
            }
            if (repeat == false) {
                firstNonRepeating = arrayChar[i];
                break;
            }
        }
        return firstNonRepeating;
    }

    static void divideAndPrint(String s, int n) {
        char[] arrayChar = s.toCharArray();
        int symbols = 0;
        for (int i = 0; i < s.length(); i++) {
            System.out.print(arrayChar[i]);
            symbols++;
            if (symbols == n) {
                System.out.println();
                symbols = 0;
            }
        }
    }

    static String reverse(String s) {
        StringBuffer reverse = new StringBuffer(s);
        return reverse.reverse().toString();
    }
}
