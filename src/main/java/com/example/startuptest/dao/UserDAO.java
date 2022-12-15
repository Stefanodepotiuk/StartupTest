package com.example.startuptest.dao;

import com.example.startuptest.models.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User,Long> {
}
