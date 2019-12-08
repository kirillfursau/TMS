package lessons.lesson5;

public class Group {
    int id;
    Student[] students = new Student[5];
    String programmingLanguage;

    Group(String programmingLanguage, int id) {
        this.programmingLanguage = programmingLanguage;
        this.id = id;
    }

    void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }
}

