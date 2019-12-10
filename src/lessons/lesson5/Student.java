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

    Student() {
        setFirstName(sc.nextLine());
        setLastName(sc.nextLine());
        setAge(sc.nextInt());
        students++;
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

    @Override
    void greet() {
        super.greet();
        System.out.println(" and i am a student");
    }
}