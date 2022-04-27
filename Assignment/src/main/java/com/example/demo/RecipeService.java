package com.example.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service//marks a Java class that performs some service, such as executing business logic, performing calculations, and calling external APIs.
public class RecipeService {
@Autowired//marks a Constructor, Setter method, Properties and Config() method as to be autowired that is 'injecting beans'(Objects) at runtime by Spring Dependency Injection mechanism 
RecipeRepository reciperepository;//creating an instance for reciperepository so that we can get that complete class here
// reciperepository contains many predefined methods like save,delete,etc., so to use that we creste instance here
public List<Recipe> getallrecipes()//when this method is called using getmapping it is executed
{
	return (List<Recipe>) reciperepository.findAll();//it finds all the elements of recipe using findall method
}
public Recipe updatenewrecipe(Recipe r)//it is called by using put method and by passing recipe class by creating r instance of recipe class
{
	return reciperepository.save(r);//save method will save it in the recipe
} 
public Recipe recipes(Recipe r)//it is called by using postmethod and passing recipe instance r of recipe
{  
	return reciperepository.save(r);
}
public void deleteRecipes(Recipe r)//it is called by delete mapping and passing recipe r instance 
{
	 reciperepository.delete(r);//delete method will delete that specified recipe.
}
public Optional<Recipe> getrecipebyid(int recipeid) {
	return reciperepository.findById(recipeid);
}
} 