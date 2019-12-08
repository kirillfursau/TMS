package lessons.lesson5;

import java.util.Scanner;

public class Student {
    String firstName;
    String lastName;
    int age;
    public boolean[] homeWork = new boolean[5];
    static int students = 0;

    Scanner sc = new Scanner(System.in);

    Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        students++;
    }

    Student() {
        this.firstName = sc.nextLine();
        this.lastName = sc.nextLine();
        this.age = sc.nextInt();
        students++;
    }

    void printInformation() {
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
    }

    String getFullName() {
        return firstName + " " + lastName;
    }

    String getFullName(String prexif) {
        return prexif + firstName + " " + lastName;
    }

    void birthDay() {
        age++;
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