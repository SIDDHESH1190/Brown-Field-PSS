package com.brownfield.pss.dao;

import org.springframework.stereotype.Service;
import com.brownfield.pss.model.User;
import com.brownfield.pss.repository.IUserRepository;
import com.brownfield.pss.service.IUserService;

@Service
public class UserDao implements IUserService {

	IUserRepository userRepos;

	@Override
	public User registerUser(User user) {
		// TODO Auto-generated method stub
		return userRepos.save(user);
	}

}
