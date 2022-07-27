package com.example.serviceImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Domains.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;


@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LogManager.getLogger(UserServiceImpl.class);

	@Autowired
	UserRepository userRepository;

	@Override
	public User save(User user) {
		userRepository.save(user);
		logger.info("user saved successsfully");
		return user;
	}

}
