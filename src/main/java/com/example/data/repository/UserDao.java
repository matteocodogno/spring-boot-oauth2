package com.example.data.repository;

import com.example.data.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author Matteo Codogno
 * @date 27/11/2016
 */
public interface UserDao extends CrudRepository<User, Long> {
    List<User> findBySurname(@Param("surname") String surname);

    User findById(@Param("id") Long id);

    List<User> findUserByUsernameAndPassword(String username, String password);

    User findByUsername(String username);
}
