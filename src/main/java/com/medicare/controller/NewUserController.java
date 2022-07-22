package com.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.model.NewUser;
import com.medicare.service.NewUserImpl;


@RestController
@RequestMapping("/")
public class NewUserController {
	@Autowired
	private  NewUserImpl newuserimpl;
	
	@PostMapping(path="/")
	public ResponseEntity<?> insertNewUser(@RequestBody NewUser user){
		newuserimpl.insertUser(user);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	@GetMapping(value="getname")
	public String getname()
	{
		return "pooja Wagh";
	}

	@GetMapping(value = "getAllUsers")
	public List<NewUser> getAllUsers() {
		System.out.println("hello");
		return newuserimpl.getAllUser();
	}
	

}
