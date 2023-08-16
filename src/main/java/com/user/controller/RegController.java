package com.user.controller;    //update method remaining
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.entities.UserRegData;
import com.user.service.RegService;

@RestController
public class RegController 
{
	@Autowired
	private RegService regService;
	
	
	@PostMapping("/save")
	public String saveRegData(@RequestBody UserRegData userRegData) 
	{
		UserRegData u1=regService.saveRegData(userRegData);
		
		String msg=null;
		
		if(u1!=null) 
	    	msg="Your Data Saved Successfully..";
		else
			msg="Please check Password and Confirm Password must have same";
		
		return msg;
		
	}
	

	
	@GetMapping("/get/{uid}")
	public UserRegData getUserData(@PathVariable Integer uid)
	{
		UserRegData u2=regService.getUserData(uid);
		
		return u2;
		
	}
	
	@GetMapping("/getall")
	public List<UserRegData> getAllUsersData()
	{
		List<UserRegData> us= regService.getAllUsers();
		
		return us;
	}
	
   @PutMapping("/update/{stdId}")
   public UserRegData updateStudent(@RequestBody UserRegData userRegData,@PathVariable Integer uid)
   {
	    
	   return regService.updateStudent(userRegData, uid);
   }
	
	@DeleteMapping("/delete/{uid}")
	public void deleteUserData(@PathVariable Integer uid)
	{
		regService.deleteUserData(uid);
		System.out.println("One User Reg Data Deleted Successfully..");
		
	}

}
