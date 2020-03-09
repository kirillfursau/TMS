package repository;

import model.User;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class UserRepository {
    public static Map<String, String> users;

    public static Map<String, String> getInstance() {
        if (users == null) {
            synchronized (UserRepository.class) {
                if (users == null) {
                    users = new ConcurrentHashMap<>();
                }
            }
        }
        return users;
    }

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
