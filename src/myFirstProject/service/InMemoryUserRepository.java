package myFirstProject.service;

import myFirstProject.model.User;

import java.util.List;

public class InMemoryUserRepository {
    private static List<User> users;

    public List<User> addUser(User user) {
        users.add(user);
        return users;
    }

    public static List<User> getUsers() {
        return users;
    }

}
