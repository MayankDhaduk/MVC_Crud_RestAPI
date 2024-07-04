package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.user;
import com.example.demo.repo.userrepo;

@Service
public class userserviceimpl implements userservice {

	@Autowired
	userrepo repo;

	@Override
	public void adduser(user u) {

		repo.save(u);
	}

	@Override
	public List<user> viewuser() {
		
		
		return repo.findAll();
	}

	@Override
	public void deleteuser(int id) {
		
		repo.deleteById(id);
		
	}

	@Override
	public void updateuser(user u) {
		repo.save(u);
		
	}

}
