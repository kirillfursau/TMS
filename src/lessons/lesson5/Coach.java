package lessons.lesson5;

public class Coach {
    String firstName;
    String lastName;
    int age;
    int yearsOfExperience;
    int group;

    Coach(String firstName, String lastName, int age, int group, int yearsOfExperience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.group = group;
        this.yearsOfExperience = yearsOfExperience;
    }

    void printInformation() {
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
    }

    String getFullName() {
        return firstName + " " + lastName;
    }

    String getFullName(String prexif) {
        return prexif + firstName + " " + lastName;
    }

    void birthDay() {
        age++;
    }
}
