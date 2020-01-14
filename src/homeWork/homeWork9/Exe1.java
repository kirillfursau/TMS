package homeWork.homeWork9;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exe1 {
    public static void main(String[] args) {
        String fileName = "/Users/kirylfursau/Downloads/strings.txt";
        String fileName1 = "/Users/kirylfursau/Downloads/blackList.txt";
        String text = "";
        String blackList = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
             BufferedReader bufferedReader1 = new BufferedReader(new FileReader(fileName1))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                text += line;
            }
            String line1;
            while ((line1 = bufferedReader1.readLine()) != null) {
                blackList += line1;
            }
            int sentensis = 0;
            if (text.length() != 0) {
                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i) == '.') {
                        sentensis++;
                    }
                }
            }
            int sumBlackWords = 0;
            if (blackList.length() != 0) {
                for (int i = 0; i < blackList.length(); i++) {
                    if (blackList.charAt(i) == ' ') {
                        sumBlackWords++;
                    }
                }
            }
            int startSentens = 0;
            int sentensNumber = 0;
            String[] sentens = new String[sentensis];
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == '.') {
                    sentens[sentensNumber] = text.substring(startSentens, i);
                    startSentens = i + 1;
                    sentensNumber++;
                } else if (i == text.length() - 1) {
                    sentens[sentensNumber] = text.substring(text.lastIndexOf('.'), text.length());
                }
            }
            int startWord = 0;
            int blackWordNumber = 0;
            String[] blackWords = new String[sumBlackWords + 1];
            for (int i = 0; i < blackList.length(); i++) {
                if (blackList.charAt(i) == ' ') {
                    blackWords[blackWordNumber] = blackList.substring(startWord, i);
                    startWord = i + 1;
                    blackWordNumber++;
                } else if (i == blackList.length() - 1) {
                    blackWords[blackWordNumber] = blackList.substring(blackList.lastIndexOf(' ') + 1,
                            blackList.lastIndexOf('.'));
                }
            }
            int startWordInText = 0;
            for (int i = 0; i < sentens.length; i++) {
                for (int j = 0; j < sentens[i].length(); j++) {
                    if (sentens[i].charAt(j) == ' ') {
                        for (int k = 0; k < blackWords.length; k++) {
                            if (sentens[i].substring(startWordInText, j).equals(blackWords[k]) && j != sentens[i].length()) {
                                System.out.println(sentens[i]);
                            } else if (j == sentens[i].length() &&
                                    sentens[i].substring(startWordInText, j - 1).equals(blackWords[k])) {
                                System.out.println(sentens[i]);
                            } else {

                            }
                        }
                        startWordInText = j + 1;
                    }
                }
                startWordInText = 0;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
