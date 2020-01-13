package lessons.lesson9;

import java.io.File;

public class Exe1 {
    public static void main(String[] args) {
        String file = "C:\\Users\\User\\Desktop\\Новая папка\\папка";
        File f = new File(file);
        f.mkdir();
        String file2 = "C:\\Users\\User\\Desktop\\TMS";
        File f2 = new File(file2);
        String[] fileNames = f2.list();
        for (String path: fileNames){
            System.out.println(path);
        }
        for (int i = 0; i < fileNames.length; i++){
            if (fileNames[i].endsWith("txt")){
                System.out.println(fileNames[i]);
            }
        }
    }
}
