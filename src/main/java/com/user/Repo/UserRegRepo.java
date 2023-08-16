package com.user.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entities.UserRegData;


public interface UserRegRepo extends JpaRepository<UserRegData, Integer> {

}
