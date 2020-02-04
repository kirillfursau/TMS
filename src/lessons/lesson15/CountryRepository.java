package lessons.lesson15;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class CountryRepository {
    public CountryRepository() {
    }

    Collection<Country> getAllCountries() {
        List<Country> countries = new ArrayList<>();
        try {
            Connection connection = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "rootroot");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM countries");
            while (resultSet.next()) {
                countries.add(new Country(resultSet.getInt("id"),
                        resultSet.getNString("name"), resultSet.getNString("code"),
                        resultSet.getInt("population")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return countries;
    }

    public Optional<Country> getCountryByCode(String code) {
        try {
            Connection connection = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "rootroot");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM countries WHERE code = '" + code + "';");
            if (resultSet.next()) {
                return Optional.of(new Country(resultSet.getInt("id"),
                        resultSet.getString("name"), resultSet.getString("code"),
                        resultSet.getInt("population")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public void addCountry(Country country) {
        try {
            Connection connection = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "rootroot");
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO countries VALUES (" + country.getId() + "," +
                    "'" + country.getName() + "','" + country.getCode() + "'," + country.getPopulation() + ")");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CountryRepository countryRepository = new CountryRepository();
        List<Country> countries = new ArrayList<>(countryRepository.getAllCountries());
        System.out.println(countries);
//        countryRepository.addCountry(new Country(3,"Ukraine","UK",200));
        System.out.println(countryRepository.getCountryByCode("BY"));
    }
}
