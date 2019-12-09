package lessons.lesson5;

public class Coach extends Human {
    private int yearsOfExperience;
    private Group group;

    Coach(String firstName, String lastName, int age, int yearsOfExperience, Group group) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        this.yearsOfExperience = yearsOfExperience;
        this.group = group;
    }

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
        setAge(getAge() + 1);
    }

    Student[] checkHomeWork(int homeWorkToCheck) {
        int count = 0;
        for (int i = 0; i < group.length; i++) {
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

    @Override
    void greet() {
        super.greet();
        System.out.println(" and i am a coach");
    }
}
