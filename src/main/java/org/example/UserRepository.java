package org.example;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private Map<String, User> users = new HashMap<String, User>();

    public UserRepository() {
        users.put("Simon", new User("Simon", "imhere"));
        users.put("Vargas", new User("Vargas", "today"));
    }

    public User findByUserName(String username) {
        return users.get(username);
    }
}
