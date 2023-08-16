package com.user.service;

import java.util.List;

import com.user.entities.UserRegData;

public interface RegService 
{

	public UserRegData saveRegData(UserRegData userRegData);

	public void deleteUserData(Integer uid);

	public UserRegData getUserData(Integer uid);

	public List<UserRegData> getAllUsers();

	public UserRegData updateStudent(UserRegData userRegData, Integer uid);
		

}
