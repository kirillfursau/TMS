package lessons.lesson9;

import java.io.*;

public class Student implements Serializable {
    String firstName;
    String lastName;
    int age;

    Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static void main(String[] args) {
        try (ObjectOutputStream obg = new ObjectOutputStream(new FileOutputStream("Person.txt"))) {
            Student st1 = new Student("Kiryl", "Fursau", 21);
            Student st3 = new Student("Pave", "Lisovsk", 25);
            obg.writeObject(st1);
            obg.writeObject(st3);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try (ObjectInputStream obn = new ObjectInputStream(new FileInputStream("Person.txt"))) {
            Student st2 = (Student) obn.readObject();
            Student st4 = (Student) obn.readObject();
            System.out.println(st2.firstName + " " + st2.lastName+ " " + st2.age);
            System.out.println(st4.firstName + " " + st4.lastName+ " " + st4.age);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

