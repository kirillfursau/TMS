package homeWork.homeWork7.exe4;

import lessons.lesson7.StringUtils;

public class TextFormater {
    static int howMuchWordsInString(String s) {
        int words = 0;
        if (s.length() != 0) {
            words = 1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    words++;
                }
            }
        }
        return words;
    }

    static boolean haveAPalindrome(String s) {
        int startWord = 0;
        int wordNumber = 0;
        boolean haveAPalindrome = false;
        String[] strings = new String[TextFormater.howMuchWordsInString(s)-1];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                strings[wordNumber] = s.substring(startWord, i);
                startWord = i + 1;
                wordNumber++;
            }
        }
        for (int i = 0; i < strings.length; i++) {
            if (StringUtils.isPalindrome(strings[i])) {
                haveAPalindrome = true;
            }
        }
        return haveAPalindrome;
    }
}
