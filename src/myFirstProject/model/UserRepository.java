package myFirstProject.model;

import java.util.Optional;

public interface UserRepository {
    public User saveUser(User user);

    Optional<User> getUserByName(String name);
}
