package com.user.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserRegData 
{

	@Id
	private Integer uid;
	private String name;
	private Long number;
	private String email;
	@Transient
	private String password;
	private String confpassword;
 
	
}
