package lessons.lesson15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

public class PersonRepository {
    void createPerson(People person) {
        try {
            Connection connection = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "rootroot");
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO people VALUES (" + person.getId() + ",'" +
                    person.getFirstName() + "','" + person.getLastName() + "',"
                    + person.getDateOfBirth() + "," + person.getBirthCityId() + ")");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void deletePersonById(Long id) {
        try {
            Connection connection = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "rootroot");
            Statement statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM people WHERE id =" + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void changeFirstName(String from, String to) {
        try {
            Connection connection = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "rootroot");
            Statement statement = connection.createStatement();
            statement.executeUpdate
                    ("UPDATE people SET first_name = '" + to + "' WHERE first_name = '" + from + "'");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
//    Collection<People> getAllPeopleOfAge(int n){
//
//    }

    public static void main(String[] args) {
        PersonRepository personRepository = new PersonRepository();
//        personRepository.createPerson(
//                new People(4, "Maksim", "Lenin", 12, 1));
        personRepository.deletePersonById(4l);
        personRepository.changeFirstName("Anna", "Hanna");
    }
}
