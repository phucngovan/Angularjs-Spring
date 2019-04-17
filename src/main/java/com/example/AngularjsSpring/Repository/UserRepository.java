package com.example.AngularjsSpring.Repository;

import com.example.AngularjsSpring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.jws.soap.SOAPBinding;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  User findByName(String name);
}
