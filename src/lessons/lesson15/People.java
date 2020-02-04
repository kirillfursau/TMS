package lessons.lesson15;

public class People {
    int id;
    String firstName;
    String lastName;
    int dateOfBirth;
    int birthCityId;

    public People() {
    }

    public People(int id, String firstName, String lastName, int dateOfBirth, int birthCityId) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);
        setBirthCityId(birthCityId);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getBirthCityId() {
        return birthCityId;
    }

    public void setBirthCityId(int birthCityId) {
        this.birthCityId = birthCityId;
    }
}
