package lessons.lesson5;

public class Coach extends Human {
    private int yearsOfExperience;
    private Group group;

    Coach(String firstName, String lastName, int age, int yearsOfExperience, Group group) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setYearsOfExperience(yearsOfExperience);
        setGroup(group);
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Group group(){
        return group;
    }
    public void setGroup(Group group){
        this.group = group;
    }

    Student[] checkHomeWork(int homeWorkToCheck) {
        Student[] checkHomeWork = group.checkHomeWorks(homeWorkToCheck);
        return checkHomeWork;
    }

    @Override
    void greet() {
        super.greet();
        System.out.println(" and i am a coach");
    }
}
