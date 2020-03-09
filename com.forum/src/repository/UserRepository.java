package repository;

import model.User;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserRepository {
    public static Map<String, String> users = new ConcurrentHashMap<>();

    public static Map<String, String> addUser(User user) {
        users.put(user.getLogin(), user.getPassword());
        return users;
    }

    public static boolean doesUserExist(User user) {
        return users.containsKey(user.getLogin());
    }

    public static boolean checkPassword(User user) {
        return users.get(user.getLogin()).equals(user.getPassword());
    }
}
