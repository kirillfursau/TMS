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
        Student[]checkHomeWork = group.checkHomeWorks(homeWorkToCheck);
        return checkHomeWork;
}

    @Override
    void greet() {
        super.greet();
        System.out.println(" and i am a coach");
    }
}
