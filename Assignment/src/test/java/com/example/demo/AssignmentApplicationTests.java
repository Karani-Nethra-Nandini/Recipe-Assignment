package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AssignmentApplicationTests {
	
	@Autowired
	RecipeRepository reciperepository;
	@Autowired
	RecipeService recipeservice;


	@Test
	void testGetallrecipes() { 
		Ingredients ig1=new Ingredients("Apple,oil,tomato,salt,chilli");
		List<Ingredients> li=new ArrayList<>();
		li.add(ig1);
		LocalDateTime date =LocalDateTime.parse("2022-04-21T16:01:21.335017");
		Recipe recipe1=new Recipe(1,"Apple","Veg",3,"ABCDEF",li);
		reciperepository.save(recipe1);

		List<Recipe> r1=(List<Recipe>)recipeservice.getallrecipes();
		assertEquals("Apple",r1.get(0).getRecipename());
	} 
	 
	@Test
	void testDeleteRecipes() {
		Ingredients ig1=new Ingredients("maggie masala,oil,water,salt,veges");
		List<Ingredients> li1=new ArrayList<>();
		li1.add(ig1);
		LocalDateTime date =LocalDateTime.parse("2022-04-21T16:01:21.335017");
		Recipe rpc=new Recipe(2,"Mango","Vegs",4,"AdBCDEF",li1);
		Recipe rc1=reciperepository.save(rpc);
		recipeservice.deleteRecipes(rpc);
		List<Recipe> r2=(List<Recipe>)recipeservice.getallrecipes();
		assertNotNull(r2.get(0).getRecipename()); 

		
	}
	
	@Test
	void testRecipes() {
		
		Ingredients ig1=new Ingredients("veges,oil,salt,chilli");
		List<Ingredients> li=new ArrayList<>();
		li.add(ig1);
		LocalDateTime date =LocalDateTime.parse("2022-04-21T16:01:21.335017");
		Recipe recipe1=new Recipe(1,"Apple","Veg",3,"ABCEDEF",li);
		Recipe r1=recipeservice.recipes(recipe1);

		assertNotNull(r1);
	} 
	
	@Test
	void testUpdatenewrecipe() {
		Ingredients ig1=new Ingredients("veges,oil,salt,chilli");
		List<Ingredients> li=new ArrayList<>();
		li.add(ig1);
		LocalDateTime date =LocalDateTime.parse("2022-04-21T16:01:21.335017");
		Recipe recipe1=new Recipe(1,"Apple","Veg",3,"ABCEDEF",li);
		reciperepository.save(recipe1);
		recipe1=new Recipe(1,"Mango","Veg",3,"ABCEDEF",li);
		Recipe r=recipeservice.updatenewrecipe(recipe1);
		assertEquals("Mango",r.getRecipename());
	}

	
	@Test
	void testFindRecipe() {
	Ingredients ig=new Ingredients("popcornseeds");
	List<Ingredients> lii=new ArrayList<>();
	lii.add(ig);
	LocalDateTime date =LocalDateTime.parse("2022-04-23T16:01:21.335017");
	Recipe rec1=new Recipe(1,"Apple","Veg",3,"ABCEDEF",lii);
	Recipe rec2=reciperepository.save(rec1);
	Optional<Recipe> rp=recipeservice.getrecipebyid(rec2.getId());

	assertEquals(rec2.getRecipename(),rp.get().getRecipename());
	}
}
