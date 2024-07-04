package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.user;

public interface userrepo extends JpaRepository<user, Integer> {

}
