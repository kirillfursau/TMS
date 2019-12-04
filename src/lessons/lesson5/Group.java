package lessons.lesson5;

public class Group {
    int id;
    Student[] students = new Student[5];
    String programmingLanguage;

    void addStudent() {
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }
    }
}

