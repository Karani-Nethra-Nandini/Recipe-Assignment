package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Integer> {// it contains Spring Data interface for generic CRUD operations on a repository of a specific type. 
	//It provides several methods out of the box for interacting with a database.
	
}
