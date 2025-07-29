package com.institute.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.institute.entity.Institute;

public interface InstituteRepository extends JpaRepository<Institute, Integer>{

	@Query(value="SELECT name, MAX(no_of_students) AS max FROM `institute-table` "
			+ "GROUP BY name;", nativeQuery=true)
	public List<String> groupBy();
	
	@Query(value="SELECT * FROM `institute-table` "
			+ "ORDER BY name DESC;", nativeQuery=true)
	public List<String> orderBy();
	
	@Query(value="SELECT I FROM Institute I WHERE id = ?1")
	public List<Institute> findById(int x);
	
	@Query(value="SELECT I FROM Institute I WHERE name = ?1")
	public Institute findByName(String x);
}
