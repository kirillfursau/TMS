package homeWork.homeWork7.exe4;

import lessons.lesson7.StringUtils;

public class TextFormater {
    /*
    Текстовый файл содержит текст. После запуска программы в
    другой файл должны записаться только те предложения в которых от
    3-х до 5-ти слов. Если в предложении присутствует слово-палиндром,
    то не имеет значения какое кол-во слов в предложении, оно попадает в новый файл.
    Пишем все в ООП стиле. Создаём класс TextFormater
    в котором два статических метода:
    1. Метод принимает строку и возвращает кол-во слов в строке.
    2. Метод принимает строку и проверяет есть ли в строке слово-палиндром.
    Если есть возвращает true, если нет false
    */
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
        String[] strings = new String[TextFormater.howMuchWordsInString(s)];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                strings[wordNumber] = s.substring(startWord, i).trim();
                startWord = i + 1;
                wordNumber++;
            } else if (i == s.length() - 1) {
                strings[wordNumber] = s.substring(s.lastIndexOf(' ') + 1, s.length());
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
