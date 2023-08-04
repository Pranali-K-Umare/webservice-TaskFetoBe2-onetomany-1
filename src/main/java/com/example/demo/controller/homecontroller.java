package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Supplier;
import com.example.demo.servicei.homeservicei;

@RestController
public class homecontroller {
	
	@Autowired
	homeservicei hsi;

	
	@PostMapping("/insert")
	public String insertData(@RequestBody Supplier a)
	{
		hsi.saveData(a);
		return "saveData Succesfully";
	}
	
	
}
