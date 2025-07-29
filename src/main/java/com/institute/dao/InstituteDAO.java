package com.institute.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.institute.entity.Institute;
import com.institute.repository.InstituteRepository;

@Repository
public class InstituteDAO {
	
	@Autowired
	InstituteRepository ir;

	public String postAll(List<Institute> list)
	{
		ir.saveAll(list);
		return "Added " + list.size() + " Successfully";
	}
	
	public List<Institute> getAll()
	{
		return ir.findAll();
	}
	
	public List<String> groupBy()
	{
		return ir.groupBy();
	}
	
	public List<String> orderBy()
	{
		return ir.orderBy();
	}
	
	public List<Institute> getById(int x)
	{
		return ir.findById(x);
	}
	
	public Institute getByName(String x)
	{
		return ir.findByName(x);
	}
}
