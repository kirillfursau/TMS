package myFirstProject.service;

import myFirstProject.model.User;
import myFirstProject.model.UserRepository;

import java.util.List;
import java.util.Optional;

public class InMemoryUserRepository implements UserRepository {
    private static List<User> users;

    public List<User> addUser(User user) {

        return users;
    }

    public static List<User> getUsers() {
        return users;
    }

    @Override
    public User saveUser(User user) {
        users.add(user);
        return user;
    }

    @Override
    public Optional<User> getUserByName(String name) {
        Optional<User> findUserByName = users.stream()
                .filter(user -> user.getName() == name)
                .findAny();
        if (findUserByName == null) {
            return Optional.empty();
        }
        return findUserByName;
    }
}
