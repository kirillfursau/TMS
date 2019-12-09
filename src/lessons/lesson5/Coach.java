package lessons.lesson5;

public class Coach extends Human {
    private int yearsOfExperience;
    private int group;

    Coach(String firstName, String lastName, int age, int group, int yearsOfExperience) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        this.group = group;
        this.yearsOfExperience = yearsOfExperience;
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
        setAge(getAge()+1);
    }
}
