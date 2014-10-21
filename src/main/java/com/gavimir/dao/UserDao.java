package com.gavimir.dao;

import com.gavimir.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    void editUser(User user);

    void deleteUser(int userId);

    User findUser(int userId);

    User findUserByName(String username);

    List<User> getAllUsers();
}
