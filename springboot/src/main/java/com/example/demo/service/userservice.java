package com.example.demo.service;

import java.util.List;

import com.example.demo.model.user;

public interface userservice 
{
	
	public void adduser(user u);
	public List<user> viewuser();
	public void deleteuser(int id);
	public void updateuser(user u);
	
}
