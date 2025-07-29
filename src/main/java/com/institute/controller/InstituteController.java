package com.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.institute.entity.Institute;
import com.institute.exception.IDNotFoundException;
import com.institute.exception.NameNotFoundException;
import com.institute.service.InstituteService;

@RestController
@RequestMapping(value="/inst/api")
public class InstituteController {
	
	@Autowired
	InstituteService is;

	@PostMapping(value="/postAll")
	public String postAll(@RequestBody List<Institute> list)
	{
		return is.postAll(list);
	}
	
	@GetMapping(value="/getAll")
	public List<Institute> getAll()
	{
		return is.getAll();
	}
	
	@GetMapping(value="/groupBy")
	public List<String> groupBy()
	{
		return is.groupBy();
	}
	
	@GetMapping(value="/orderBy")
	public List<String> orderBy()
	{
		return is.orderBy();
	}
	
	@GetMapping(value="/getById/{x}")
	public List<Institute> getById(@PathVariable int x) throws IDNotFoundException
	{
		return is.getById(x);
	}
	
	@GetMapping(value="/getByName/{x}")
	public Institute getByName(@PathVariable String x) throws NameNotFoundException
	{
		return is.getByName(x);
	}
}
