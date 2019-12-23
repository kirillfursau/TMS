package homeWork.homeWork7;

public class StringUtils {
    public static int countCharacterEnteries(String s, char c) {
        int coutEnteries = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == c)) {
                coutEnteries++;
            }
        }
        return coutEnteries;
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
}