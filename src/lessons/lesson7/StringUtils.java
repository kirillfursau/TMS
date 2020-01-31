package lessons.lesson7;

public class StringUtils {
    /*
    int countCharacterEntries(String s, char c) - подсчитать кол-во вхождений символа в строку
    */
    public static int countCharacterEntries(String s, char c) {
        int coutEntries = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == c)) {
                coutEntries++;
            }
        }
        return coutEntries;
    }

    /*
    boolean startsWithDigit(String s) - строка начинается с цифры
    */
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

    /*
    String findLongest(String... strings) - найти самую длинную строку. Если несколько строк имеют
    одинаковую длину - вывести любую. Или лучше их все, но необязательно.
    */
    public static String findLongest(String... strings) {
        String longest = strings[0];
        for (int i = 0; i < strings.length; i++) {
            if (longest.length() < strings[i].length()) {
                longest = strings[i];
            }
        }
        return longest;
    }

    /*
    kek(String s) - заменить все lol на kek
    */
    public static String kek(String s) {
        return s.replace("kek", "lol");
    }

    /*
    unkek(String s) - удалить все kek из строки
    */
    public static String unkek(String s) {
        return s.replace("kek", "");
    }

    /*
    int[] count20(String s) - найти все индексы вхождений числа 20 в строку
    */
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

    /*
    char findMostFrequentChar(String s) - найти самый часто встречающийся символ
    */
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

    /*
     char findFirstNonRepeating(String s) - найти первый символ, который встречается в строке один раз
    */
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

    /*
    divideAndPrint(String s, int n) - поделить строку на части по n символов и вывести их одна под одной
    */
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

    /*
    String reverse(String s) - перевернуть строку
    */
    static String reverse(String s) {
        StringBuffer reverse = new StringBuffer(s);
        return reverse.reverse().toString();
    }

    /*
    boolean isPalindrome(String s) - строка является палиндромом
    */
    public static boolean isPalindrome(String s) {
        boolean palindrome = false;
        if (s.equalsIgnoreCase(reverse(s)) && s.length() != 1) {
            palindrome = true;
        }
        return palindrome;
    }

    /*
    String wow(String s) - СдЕлАтЬ Со сТрОкОй вОт тАкОе
    */
    static String wow(String s) {
        StringBuffer wow = new StringBuffer(s.toLowerCase());
        char[] arrayChar = s.toLowerCase().toCharArray();
        for (int i = 0; i < wow.length(); i += 2) {
            arrayChar[i] = Character.toUpperCase(arrayChar[i]);
            wow.setCharAt(i, arrayChar[i]);
        }
        return wow.toString();
    }

    /*
    String repeat(String s, int times) - вернуть строку, в которой строка s повторяется times раз
    */
    static String repeat(String s, int times) {
        StringBuffer repeat = new StringBuffer();
        if (count20(s).length <= times) {
            repeat.insert(0, s);
        }
        return repeat.toString();
    }

    /*
    String shuffle(String s) - перемешать символы в строке случайным образом
    */
    static String shuffle(String s) {
        StringBuffer shuffle = new StringBuffer(s);
        for (int i = 0; i < shuffle.length(); i++) {
            int j = (int) (Math.random() * shuffle.length());
            if (shuffle.charAt(i) != ' ' && shuffle.charAt(j) != ' ') {
                char k = shuffle.charAt(i);
                shuffle.setCharAt(i, shuffle.charAt(j));
                shuffle.setCharAt(j, k);
            }
        }
        return shuffle.toString();
    }
}
