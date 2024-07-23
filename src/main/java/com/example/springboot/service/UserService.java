package com.example.springboot.service;

import com.example.springboot.model.User;

;import java.util.List;

public interface UserService {

    List<User> listUsers();

    void add(User user);

    void update(User user);

    void delete(Long id);

    User getById(Long id);
}
