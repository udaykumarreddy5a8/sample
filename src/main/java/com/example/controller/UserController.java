package com.example.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Domains.User;
import com.example.service.UserService;




@RestController
@RequestMapping(path = "/users")
public class UserController {

    private static final Logger logger = LogManager.getLogger(UserController.class);

  
    @Autowired
    private UserService userService;
    
    private User saveBook(@RequestBody User user)   
    {  
    	userService.save(user);
    	logger.info("user saved");
		return user;
    }
	
}
