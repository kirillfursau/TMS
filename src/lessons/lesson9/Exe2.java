package lessons.lesson9;

import java.io.*;

public class Exe2 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\User\\Desktop\\TMS\\file.txt";
        String fileName1 = "C:\\Users\\User\\Desktop\\TMS\\file5.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileName1))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

//        String[] strings = new String[countlines];
//        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
//
//            String line;
//            int i = 0;
//            while ((line = br.readLine()) != null) {
//                strings[i] = line;
//                i++;
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName1))){
//            for (int  i = 0; i < strings.length;i++){
//                bw.write(strings[i] + "\n");
//            }
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
    }
}
