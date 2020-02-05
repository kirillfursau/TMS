package lessons.lesson15;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CityRepository {
    public CityRepository() {
    }

    City getCapitalOf(Country country) {
        List<City> cities = new ArrayList<>();
        try {
            Connection connection = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "rootroot");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM cities");
            while (resultSet.next()) {
                cities.add(new City(resultSet.getInt("id"),
                        resultSet.getNString("name"), resultSet.getInt("country_id"),
                        resultSet.getBoolean("is_capital")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).countryId == country.getId() && cities.get(i).isCapital) {
                return cities.get(i);
            }
        }
        return null;
    }

    Optional<City> getCityByCountryCodeAndName(String countryCode, String name) {
        try {
            Connection connection = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "rootroot");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM cities WHERE country_id = " +
                    CountryRepository.getCountryByCode(countryCode).get().getId() + " and name  = '" + name +  "';");
            if (resultSet.next()) {
                return Optional.of(new City(resultSet.getInt("id"),
                        resultSet.getString("name"), resultSet.getInt("country_id"),
                        resultSet.getBoolean("is_capital")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    void addCity(City city) {
        try {
            Connection connection = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "rootroot");
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO cities VALUES (" + city.getId() + "," +
                    "'" + city.getName() + "'," + city.countryId + "," + city.isCapital + ")");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CityRepository cityRepository = new CityRepository();
//        CountryRepository countryRepository = new CountryRepository();
//        List<Country> countries = new ArrayList<>(countryRepository.getAllCountries());
//        System.out.println(cityRepository.getCapitalOf(countries.get(2)));
//        cityRepository.addCity(new City(7, "Brest", 1, false));
        System.out.println(cityRepository.getCityByCountryCodeAndName("BY","Minsk"));
    }
}

