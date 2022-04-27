package com.example.demo;//name of the package in which this entity is created
import java.time.LocalDateTime;
import java.util.ArrayList;//list of imports
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
@Entity//this annotation will make a class mapped to a table.
public class Recipe {//public means that class can be accessed by any class.class is a blueprint which has methods and recipe is the name of the class. 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;//it is a primary key of type integer.it is id of the recipe
	
private String recipename;//it is of type string.it describes the recipe name
private String vegornonveg;//it is of type string.it describes whether recipe is vegetarian or non vegetarian.
private int noofservings;//it is of type string.it describes no of people the dish is suitable for
private String instructions;//it is of type string.it describes the instructions to cook the dish
@OneToMany(cascade=CascadeType.ALL)
private List<Ingredients> i;
@CreationTimestamp

private LocalDateTime dateTime;

public LocalDateTime getDateTime() {
	return dateTime;
}
public void setDateTime(LocalDateTime dateTime) {
	this.dateTime = dateTime;
}
public String getInstructions() {
	return instructions;
}
public void setInstructions(String instructions) {
	this.instructions = instructions;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getRecipename() {
	return recipename;
}
public void setRecipename(String recipename) {
	this.recipename = recipename;
}
public String getVegornonveg() {
	return vegornonveg;
}
public void setVegornonveg(String vegornonveg) {
	this.vegornonveg = vegornonveg;
}
public int getNoofservings() {
	return noofservings;
}
public void setNoofservings(int noofservings) {
	this.noofservings = noofservings;
}

public List<Ingredients> getI() {
	return i; 
}
public void setI(List<Ingredients> i) {
	this.i = i;
} 
public Recipe(int id, String recipename, String vegornonveg, int noofservings, String instructions, List<Ingredients> i) {
	super();
	this.id = id;
	this.recipename = recipename;
	this.vegornonveg = vegornonveg; 
	this.noofservings = noofservings;
	this.instructions = instructions;
	this.i = i;
}
public Recipe() {
	super(); 
}
@Override
public String toString() {
	return "Recipe [id=" + id + ", recipename=" + recipename + ", vegornonveg=" + vegornonveg + ", noofservings="
			+ noofservings + ", instructions=" + instructions + ", i=" + i + "]"; 
}



}