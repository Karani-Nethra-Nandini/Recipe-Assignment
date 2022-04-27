package com.example.demo;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController//used for making restful web services with the help of the @RestController annotation
public class RecipeController {
@Autowired RecipeService recipeservice;//autowiring the recipeservice class by creating an nstance of it
//placing an instance of one bean into the desired field in an instance of another bean.
@GetMapping("/deliver")//get mapping is used to display the recipes we have stored till now
public Iterable<Recipe> display()//when deliver is called by using getmapping display method is called
{
	return recipeservice.getallrecipes();//it will return getallrecipes method in recipeservice
} 
@PutMapping("/replace")//put mapping is used to update the details already given 
public Recipe updateRecipe(@RequestBody Recipe r)//when replace is called by using putmapping updaterecipe method is called
{
	return recipeservice.updatenewrecipe(r);//it will return updatenewrecipe method in recipeservice
}
@PostMapping("/pickup")//postmapping is used to enter new recipes in recipe entity
public Recipe postRecipe(@RequestBody Recipe r)//when pickup is called by using postmapping postrecipe method is called 
{ 
	System.out.println("Suucessfully added the recipe");
	return recipeservice.recipes(r);//it will return recipes method in recipeservice
	
}
@DeleteMapping("/destroy")//delete mapping is used to delete the existing recipes
public Iterable<Recipe> deleteRecipe(@RequestBody Recipe r)//when destroy is called by using deletemapping deleterecipe method is called
{
	recipeservice.deleteRecipes(r);//it will delete that specific recipe
	return recipeservice.getallrecipes();//it will return the remaining list of recipes.
}
@GetMapping("/IDDeliver/{Recipeid}")
public Optional<Recipe> getRecipeByID(@PathVariable int Recipeid)
{
	return recipeservice.getrecipebyid(Recipeid);
}
}