package repository;

import model.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    public static Map<String, String> users = new HashMap<>();

    public static Map<String, String> addUser(User user) {
        users.put(user.getLogin(), user.getPassword());
        return users;
    }

    public static boolean findUser(User user) {
        return users.containsKey(user.getLogin());
    }

    public static boolean checkPassword(User user) {
        return users.get(user.getLogin()).equals(user.getPassword());
    }
}
