package com.demo.service;

import com.demo.domain.User;

import java.util.List;

public interface UserService {
    User selectById (Long id);

    void saveUser(User user);

    void saveUserList(List<User> userList);
}
