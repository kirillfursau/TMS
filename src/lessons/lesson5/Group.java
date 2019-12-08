package lessons.lesson5;

public class Group {
    int id;
    Student[] students = new Student[5];
    String programmingLanguage;

    Group(String programmingLanguage, int id) {
        this.programmingLanguage = programmingLanguage;
        this.id = id;
    }

    String groupInformation() {
        return programmingLanguage + " " + id;
    }

    void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    void printGroupInformation() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                students[i].printInformation();
            }
        }
    }

    static Group[] groups = new Group[5];
//    Group[] allGroups(Group group){
//        for (int i = 0; i < groups.length;i++){
//            groups[i] = group;
//        }
//        return groups;
//    }
//    void printAllGroups(){
//        for (int i = 0; i < groups.length; i++){
//            System.out.println(groups[i]);
//        }
//    }

    void addGroup(Group group) {
        for (int i = 0; i < groups.length; i++) {
            if (groups[i] == null) {
                groups[i] = group;
                break;
            }
        }
    }

    void printGroupsInformation() {
        for (int i = 0; i < groups.length; i++) {
            if (groups[i] != null) {
                System.out.println(groups[i].groupInformation());
            }
        }
    }

    Student[] checkHomeWork(int homeWorkToCheck) {
        int count = 0;
        Student[] checkHomeWork = new Student[count];
        boolean[] homeWork = new boolean[5];
        for (int i = 0; i < students.length; i++) {
            if (homeWork[i] == true) {
                checkHomeWork[count] = students[i];
                count++;
            }
        }
        return checkHomeWork;
    }
}


