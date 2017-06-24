package com.anuja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anuja.dao.SignUpDAO;
import com.anuja.entity.UserPojo;
@Controller
public class AppController {

	@Autowired
	private SignUpDAO signUpDAO;
	
	@RequestMapping("/form")
	public String getForm() {
		return "RegisterForm";
	}
	
	@RequestMapping(value="/submitRegistration", method=RequestMethod.POST)
	public String submitForm(@RequestBody UserPojo obj) {
		
		System.out.println(signUpDAO.registerUser(obj));
		return "RegisterSuccess";
	}
}
