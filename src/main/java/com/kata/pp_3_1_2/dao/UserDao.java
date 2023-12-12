package com.kata.pp_3_1_2.dao;


import com.kata.pp_3_1_2.models.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void createUser(User user);

    User getUserById(Long id);

    void editUser(Long id, User user);

    void deleteUser(long id);
}
