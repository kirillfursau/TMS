package lessons.lesson5;

import java.util.Scanner;

public class Student extends Human {
    public boolean[] homeWork = new boolean[5];
    static int students = 0;

    Scanner sc = new Scanner(System.in);

    Student(String firstName, String lastName, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        students++;
    }
//
//    Student() {
//        this.firstName = sc.nextLine();
//        this.lastName = sc.nextLine();
//        this.age = sc.nextInt();
//        students++;
//    }

    void printInformation() {
        System.out.println(getFirstName());
        System.out.println(getLastName());
        System.out.println(getAge());
    }

    String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    String getFullName(String prexif) {
        return prexif + getFirstName() + " " + getLastName();
    }

    void birthDay() {
       setAge(getAge()+1);
    }

    void doHomeWork(int i) {
        homeWork[i] = true;
    }

    int[] getHomeWorkDone() {
        int doneHomeWork = 0;
        for (int i = 0; i < homeWork.length; i++) {
            if (homeWork[i]) {
                doneHomeWork++;
            }
        }
        int[] getHomeWorkDone = new int[doneHomeWork];
        int count = 0;
        for (int i = 0; i < homeWork.length; i++) {
            if (homeWork[i]) {
                getHomeWorkDone[count] = i;
                count++;
            }
        }
        return getHomeWorkDone;
    }

    static int getNumberOfStudents() {
        return students;
    }
}