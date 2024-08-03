package com.app.gsa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.gsa.DTO.MatrimonyDTO;
import com.app.gsa.service.MatrimonyService;
@Controller
@RequestMapping("/")
public class MatrimonyController {
	@Autowired
	private MatrimonyService service;
	//methods for each request
	//for register
	@RequestMapping(value="/register.do",method=RequestMethod.POST)
	public String register(@ModelAttribute MatrimonyDTO dto) {
		System.out.println("inside register..");
		service.register(dto);
		return "views/success.html";
	}
	
	//for login
	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	public void login() {
		System.out.println("inside login..");
	}
}
