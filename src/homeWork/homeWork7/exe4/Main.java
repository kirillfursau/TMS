package homeWork.homeWork7.exe4;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String fileName = "/Users/kirylfursau/Downloads/strings.txt";
        FileReader fr = new FileReader(fileName);
        Scanner scan = new Scanner(fr);

        String s = "";
        while (scan.hasNextLine()) {
            s += scan.nextLine();
        }
        fr.close();
        int sentensis = 0;
        if (s.length() != 0) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '.') {
                    sentensis++;
                }
            }
        }
        int startSentens = 0;
        int sentensNumber = 0;
        String[] sentens = new String[sentensis];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                sentens[sentensNumber] = s.substring(startSentens, i);
                startSentens = i + 1;
                sentensNumber++;
            } else if (i == s.length() - 1) {
                sentens[sentensNumber] = s.substring(s.lastIndexOf('.'), s.length());
            }
        }
        for (int i = 0; i < sentens.length; i++) {
            System.out.println(sentens[i].trim());
        }
        System.out.println(TextFormater.haveAPalindrome(sentens[0]));
        FileWriter nFile = new FileWriter("file2.txt");
        for (int i = 0; i < sentens.length; i++) {
            if (TextFormater.howMuchWordsInString(sentens[i].trim()) <= 5 && TextFormater.howMuchWordsInString
                    (sentens[i].trim()) >= 3 || TextFormater.haveAPalindrome(sentens[i].trim())) {
                nFile.write(sentens[i].trim() + "\n");
            }
        }
        nFile.close();
    }
}

