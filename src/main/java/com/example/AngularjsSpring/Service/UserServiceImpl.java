package com.example.AngularjsSpring.Service;

import com.example.AngularjsSpring.Repository.UserRepository;
import com.example.AngularjsSpring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
  @Autowired
 private UserRepository userRepository;

  @Override
  public User findById(Long id) {
    return userRepository.findById(id).orElse(null);
  }

  @Override
  public User findByName(String name) {
    return userRepository.findByName(name);
  }

  @Override
  public void saveUser(User user) {
    userRepository.save(user);

  }

  @Override
  public void updateUser(User user) {
    saveUser(user);

  }

  @Override
  public void deleteUserById(Long id) {
    userRepository.deleteById(id);

  }

  @Override
  public void deleteAllUsers() {
    userRepository.deleteAll();

  }

  @Override
  public List<User> findAllUsers() {
    return userRepository.findAll();
  }

  @Override
  public boolean isUserExist(User user) {
    return findByName(user.getName()) != null;
  }
}
