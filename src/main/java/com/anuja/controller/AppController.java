package com.anuja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping(value="/submitRegistration", method=RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String submitForm(UserPojo obj, Model model) {
		if (signUpDAO.registerUser(obj))
			model.addAttribute("msg", "Welcome"+obj.getName());
		else
			model.addAttribute("msg", "Sorry you could not be registered "+obj.getName());
		return "RegisterSuccess";
	}
}
