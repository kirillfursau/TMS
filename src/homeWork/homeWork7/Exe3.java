package homeWork.homeWork7;

import lessons.lesson7.StringUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Exe3 {
    public static void main(String[] args) throws Exception {
        String fileName = "/Users/kirylfursau/Desktop/TMS/file.txt";
        int countlines = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {
                countlines++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] strings = new String[countlines];
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                strings[i] = line;
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileWriter nFile = new FileWriter("file2.txt");
        for (int i = 0; i < strings.length; i++) {
            if (StringUtils.isPalindrome(strings[i])) {
                nFile.write(strings[i] + "\n");
            }
        }
        nFile.close();
    }
}


