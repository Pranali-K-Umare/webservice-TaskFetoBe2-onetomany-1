package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Supplier;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.supplierRepository;
import com.example.demo.servicei.homeservicei;

@Service
public class homeserviceimpl implements homeservicei {
	@Autowired
	ProductRepository pr;
	@Autowired
	supplierRepository sr;
	
	
	public void saveData(Supplier s)
	{
		sr.save(s);
	}
	
	

}
