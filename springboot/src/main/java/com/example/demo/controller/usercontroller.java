package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.user;
import com.example.demo.service.userservice;

@RestController
public class usercontroller {

	@Autowired
	userservice userservice;

	@GetMapping("/")
	public List<user> index() {

		return userservice.viewuser();
	}

	@PostMapping("/")
	public String adduser(@RequestBody user u) {
		userservice.adduser(u);
		return "User added successfully";
	}

	@DeleteMapping("/")
	public String deleteuser(@RequestParam("id") int id) {
		userservice.deleteuser(id);

		return "Deleted user Successfully";
	}
	
	@PutMapping("/")
	public String updateuser(@RequestBody user u) {

		userservice.updateuser(u);
		return "Update Successfully";
	}

}
