package com.medicare.service;

import java.util.List;

import com.medicare.model.NewUser;


public interface NewUserInterph {
	NewUser insertUser(NewUser user);
	List<NewUser> getAllUser();
}
