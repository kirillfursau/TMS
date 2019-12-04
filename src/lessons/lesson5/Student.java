package lessons.lesson5;

import java.util.Scanner;

public class Student {
    String firstName;
    String lastName;
    int age;
    boolean[] homeWork;
    Scanner sc = new Scanner(System.in);

    Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    Student() {

        this.firstName = sc.nextLine();
        this.lastName = sc.nextLine();
        this.age = sc.nextInt();
    }

    void printInformation() {
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
    }

    String getFullName(String prexif) {
        return prexif + firstName + " " + lastName;
    }

    int birtDay() {
        age++;
    }

    void doHomeWork(int i) {
        homeWork[i] = true;
    }

    int[] getHomeWorkDone() {

    }
}