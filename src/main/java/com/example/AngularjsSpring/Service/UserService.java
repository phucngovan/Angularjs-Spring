package com.example.AngularjsSpring.Service;

import com.example.AngularjsSpring.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

  User findById(Long id);

  User findByName(String name);

  void saveUser(User user);

  void updateUser(User user);

  void deleteUserById(Long id);

  void deleteAllUsers();

  List<User> findAllUsers();

  boolean isUserExist(User user);
}
