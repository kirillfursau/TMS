package homeWork.homeWork7;

import lessons.lesson7.StringUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Exe3 {
    public static void main(String[] args)throws Exception {
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
            while ((line = br.readLine()) != null) {
                for (int i = 0; i < strings.length; i++)
                    strings[i] = line;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < strings.length; i++) {
            FileWriter nFile = new FileWriter("file1.txt");
            if (StringUtils.isPalindrome(strings[i])) {
                nFile.write(strings[i]);
            }
        nFile.close();
        }
    }
}

//    void findPalindrome(String[] strings) {
//        for (int i = 0; i < strings.length; i++) {
//            if (StringUtils.isPalindrome(strings[i])) {
//                System.out.println(strings[i]);
//            }
//        }
//    }

