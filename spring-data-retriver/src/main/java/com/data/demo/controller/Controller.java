package com.data.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.data.demo.entity.scheme;
import com.data.demo.exception.ElementNotFoundException;
import com.data.demo.service.Service;

@RestController
public class Controller {
	@Autowired
	private Service service;
	
	@GetMapping("/getAllDetails")
	public List<scheme> getAllValues() {
		return service.findAll();
	}
	
	@GetMapping("/getbyId/{id}")
	public List<scheme> getAllValues(@PathVariable("id") Integer id) throws ElementNotFoundException {
		return service.findById(id);
	}

}
