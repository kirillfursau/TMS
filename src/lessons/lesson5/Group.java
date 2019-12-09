package lessons.lesson5;

public class Group {
    private int id;
    String programmingLanguage;
    static Group[] groups;
    int groupCount = 0;
    private static int countGroups = 0;
    Student[] students;

    Group(String programmingLanguage, int id) {
        this.programmingLanguage = programmingLanguage;
        this.id = id;
        groups = new Group[countGroups];
        countGroups++;
    }

    String groupInformation() {
        return programmingLanguage + " " + id;
    }

    void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                groupCount++;
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

//    static Group[] groups = new Group[5];
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

    Student[] checkHomeWorks(int homeWorkToCheck) {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                for (int j = 0; j < students[i].getHomeWorkDone().length; j++)
                    if (students[i].getHomeWorkDone()[j] == homeWorkToCheck) {
                        count++;
                    }
            }
        }
        Student[] checkHomeWorkDone = new Student[count];
        count = 0;
        if (checkHomeWorkDone[count] == null) {
            for (int i = 0; i < students.length; i++) {
                if (students[i] != null) {
                    for (int j = 0; j < students[i].getHomeWorkDone().length; j++)
                        if (students[i].getHomeWorkDone()[j] == homeWorkToCheck) {
                            checkHomeWorkDone[count] = students[i];
                            count++;
                        }
                }
            }
        }
        return checkHomeWorkDone;
    }
}


