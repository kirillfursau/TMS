package lessons.lesson5;

public class Human {
    private String firstName;
    private String lastName;
    private int age;


    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    void greet(){
        System.out.print("Hello. I am a human. My name is " +getFirstName() + " " + getLastName() );
    }
}
