package com.tts.ecommercepage.Repositories;

import com.tts.ecommercepage.Models.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{
    User findByUsername(String username);
}
