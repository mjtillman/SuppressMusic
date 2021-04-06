package com.surpressmusic.store.repositories;

import com.surpressmusic.store.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
   User findByUsername(String username);
   User findById(Integer id);
   List<User> findAll();
}
