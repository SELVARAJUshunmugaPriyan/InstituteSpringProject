package com.institute.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.institute.dao.InstituteDAO;
import com.institute.entity.Institute;
import com.institute.exception.IDNotFoundException;
import com.institute.exception.NameNotFoundException;

@Service
public class InstituteService {

	@Autowired
	InstituteDAO id;

	public String postAll(List<Institute> list)
	{
		return id.postAll(list);
	}
	
	public List<Institute> getAll()
	{
		return id.getAll();
	}
	
	public List<String> groupBy()
	{
		return id.groupBy();
	}
	
	public List<String> orderBy()
	{
		return id.orderBy();
	}
	
	public List<Institute> getById(int x) throws IDNotFoundException
	{
		if (id.getById(x).isEmpty())
			throw new IDNotFoundException("ID NOT FOUND");
		return id.getById(x);
	}
	
	public Institute getByName(String x) throws NameNotFoundException
	{
		if (id.getByName(x) == null)
			throw new NameNotFoundException("INVALID NAME");
		return id.getByName(x);
	}
}
