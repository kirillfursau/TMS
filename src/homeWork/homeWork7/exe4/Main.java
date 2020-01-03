package homeWork.homeWork7.exe4;

import lessons.lesson7.StringUtils;
import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
        int words = 0;
        if (s.length() != 0) {
            words = 1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '.') {
                    words++;
                }
            }
        }
        int startSentens = 0;
        int sentensNumber = 0;
        String[] sentens = new String[words];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                sentens[sentensNumber] = s.substring(startSentens, i);
                startSentens = i + 1;
                sentensNumber++;
            } else if (i == s.length() - 1) {
                sentens[sentensNumber] = s.substring(s.lastIndexOf('.') + 1, s.length());
            }
        }
        for (int i = 0; i < sentens.length; i++) {
            System.out.println(sentens[i]);
        }
        FileWriter nFile = new FileWriter("file2.txt");
        for (int i = 0; i < sentens.length; i++) {
            if (TextFormater.howMuchWordsInString(sentens[i]) <= 5 && TextFormater.howMuchWordsInString(sentens[i]) >= 3
                    || TextFormater.haveAPalindrome(sentens[i])) {
                nFile.write(sentens[i] + "\n");
            }
        }
        nFile.close();
    }
}

