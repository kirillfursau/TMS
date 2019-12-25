package lessons.lesson7;

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
            if (s.indexOf("20",index) == -1){
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
}
