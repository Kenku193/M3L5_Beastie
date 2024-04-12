package org.example.repository;

import org.example.entity.User;

public class UserRepository implements Repository<User> {

    @Override
    public User getUser(Long id, String login, String password) {
        return new User(id, login, password);
    }
}
