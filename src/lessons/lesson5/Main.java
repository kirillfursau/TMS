package lessons.lesson5;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        st1.printInformation();
        System.out.println(st1.getFullName("Mr. "));
        st1.doHomeWork(2);
        st1.doHomeWork(3);
        int[] homeWorkDone = st1.getHomeWorkDone();
        for (int i = 0; i < homeWorkDone.length; i++) {
            System.out.println(homeWorkDone[i]);
        }

        Group gr1 = new Group("java", 1);
//        Group gr2 = new Group("kotlin", 6);
//        Group gr3 = new Group("JS", 7);
//        Group gr4 = new Group("all",0);
        gr1.addStudent(st1);
        gr1.addStudent(st2);
        gr1.addStudent(st3);
//        gr1.checkHomeWork(2);
        System.out.println(gr1.checkHomeWork(2));
//        System.out.println("В группе 1 ");
//        gr1.printGroupInformation();
//        gr2.printGroupInformation();
//        gr3.printGroupInformation();
//        gr3.addGroup(gr1);
//        gr3.addGroup(gr2);
//        gr3.addGroup(gr3);
//        gr3.printGroupsInformation();
//
//        Coach co1 = new Coach("Yauhen", "Parmon", 23, 1, 5);
//        co1.printInformation();

    }
}
