package com.institute.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="institute-table")
public class Institute {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name, divisions;
	private int noOfStudents;
	private List<String> trainers;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDivisions() {
		return divisions;
	}
	public void setDivisions(String divisions) {
		this.divisions = divisions;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	public List<String> getTrainers() {
		return trainers;
	}
	public void setTrainers(List<String> trainers) {
		this.trainers = trainers;
	}
}
