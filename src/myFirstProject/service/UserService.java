package myFirstProject.service;

import myFirstProject.model.User;
import myFirstProject.repository.UserRepository;
import myFirstProject.model.exception.NotFoundException;
import myFirstProject.repository.InMemoryUserRepository;

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

    public User findUserByName(String name, InMemoryUserRepository inMemoryUserRepository) throws NotFoundException {
        if (inMemoryUserRepository.getUserByName(name).isPresent()) {
            return inMemoryUserRepository.getUserByName(name).get();
        }
        throw new NotFoundException();
    }
}
