package com.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.Repo.UserRegRepo;
import com.user.entities.UserRegData;

@Service
public class RegServiceImpl implements RegService
{
	@Autowired
	private UserRegRepo userRegRepo;

	@Override
	public UserRegData saveRegData(UserRegData userRegData) 
	{
		String rpwd = userRegData.getPassword();
		String cpwd = userRegData.getConfpassword();
		
		if(rpwd.equals(cpwd))
		{
			
			return userRegRepo.save(userRegData);
	
		}
		return null;
		
		
	}

	@Override
	public UserRegData getUserData(Integer uid) {
		UserRegData u2=userRegRepo.findById(uid).get();
		return u2;
	}

	@Override
	public void deleteUserData(Integer uid) 
	{
		userRegRepo.deleteById(uid);
		
	}

	@Override
	public List<UserRegData> getAllUsers() {
		List<UserRegData> s1=new ArrayList<UserRegData>();
		s1=userRegRepo.findAll();
		return s1 ;
	}

	@Override
	public UserRegData updateStudent(UserRegData userRegData, Integer uid) {
		// TODO Auto-generated method stub
		return null;
	}

}
