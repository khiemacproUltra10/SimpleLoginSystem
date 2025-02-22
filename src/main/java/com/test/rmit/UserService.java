package com.test.rmit;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private final Map<String, String> users;

    public UserService() {
        users = new HashMap<>();
        users.put("admin", "password123"); // Predefined users
        users.put("user1", "welcome123");
    }

    public boolean login(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}
