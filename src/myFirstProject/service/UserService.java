package myFirstProject.service;

import myFirstProject.model.User;
import myFirstProject.model.UserRepository;

import java.util.Optional;

public class UserService {
    private UserRepository userRepository;
    static int counter = 0;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String name) {
        return new User(counter++, name);
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public Optional<User> getUserByName(String name) {
        Optional<User> findUserByName = InMemoryUserRepository.getUsers().stream()
                .filter(user -> user.getName() == name)
                .findAny();
        if (findUserByName == null) {
            return Optional.empty();
        }
        return findUserByName;
    }
}
