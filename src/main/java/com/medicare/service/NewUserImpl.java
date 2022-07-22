package com.medicare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.model.NewUser;
import com.medicare.repository.NewUserRepository;
@Service
public class NewUserImpl implements NewUserInterph {

	@Autowired

	private NewUserRepository newuserrepository;
	//public NewUserImpl(NewUserRepository newuserrepositort) {
		//super();
		//this.newuserrepository = newuserrepository;
	//}
	@Override
	public NewUser insertUser(NewUser user)
	{
		return newuserrepository.save(user);
	}
	@Override
	public List<NewUser> getAllUser() {
		// TODO Auto-generated method stub
		return newuserrepository.findAll();
	}

}
