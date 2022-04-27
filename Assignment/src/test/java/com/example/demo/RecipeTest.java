package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class RecipeTest {
	@Test
	void testGetDateTime() {
	LocalDateTime date =LocalDateTime.parse("2022-04-21T16:01:21.335017");
	LocalDateTime date1 =LocalDateTime.parse("2022-04-21T16:01:21.335017");
	Recipe re=new Recipe();
	re.setDateTime(date);
	LocalDateTime date2 =re.getDateTime();
	assertEquals(date1,date2); } @Test
	void testSetDateTime() {
	LocalDateTime date =LocalDateTime.parse("2022-04-21T16:01:21.335017");
	LocalDateTime date1 =LocalDateTime.parse("2022-04-21T16:01:21.335017");
	Recipe re=new Recipe();
	re.setDateTime(date);
	LocalDateTime date2 =re.getDateTime();
	assertEquals(date1,date2);
	}
	@Test
	void testIsVegetarian() {
	Recipe re=new Recipe();
	re.setVegornonveg("VEG");
	
	assertNotNull(re.getVegornonveg());
	}
	@Test
	void testSetVegetarian() {
	Recipe re=new Recipe();
	re.setVegornonveg("VEG");
	assertNotNull(re.getVegornonveg());
	} 
	@Test
	void testGetRecipeId() {
	Recipe re=new Recipe();
	int res=re.getId();
	assertEquals(0,res);
	} 
	@Test
	void testSetRecipeId() {
	Recipe re=new Recipe();
	re.setId(5);
	assertEquals(5,re.getId()); } 
	@Test
	void testGetRecipeName() {
	Recipe re=new Recipe();
	re.getRecipename();
	assertEquals(null,re.getRecipename());
	} @Test
	void testSetRecipeName() {
	Recipe re=new Recipe();
	re.setRecipename("Beans");
	assertEquals("Beans",re.getRecipename());
	} @Test
	void testGetCookingInstructions() {
	Recipe re=new Recipe();
	assertEquals(null,re.getInstructions());
	} @Test
	void testSetCookingInstructions() {
	Recipe re=new Recipe();
	re.setInstructions("toss all veges in pan");
	assertEquals("toss all veges in pan",re.getInstructions());
	} 
	@Test
	void testGetDishsuitable() {
	Recipe re=new Recipe();
	re.setNoofservings(5);
	int i=5;
	assertEquals(5,re.getNoofservings());
	} @Test
	void testSetDishsuitable() {
	Recipe re=new Recipe();
	re.setNoofservings(10);
	int i=10;
	assertEquals(i,re.getNoofservings());
	} @Test
	void testGetIngredients() {
	Recipe re=new Recipe();
	Ingredients ig1=new Ingredients();
	ig1.setIngredientsnames("water,coffee powder,sugar");
	List<Ingredients> li=new ArrayList<>();
	li.add(ig1);
	List<Ingredients> li1=new ArrayList<>();
	li1.add(ig1);
	re.setI(li);
	assertEquals(li1,re.getI());
	} @Test
	void testSetIngredients() {
	Recipe re=new Recipe();
	Ingredients ig1=new Ingredients();
	ig1.setIngredientsnames("watermelon,sugar,icecream");
	List<Ingredients> li=new ArrayList<>();
	li.add(ig1);
	List<Ingredients> li1=new ArrayList<>();
	li1.add(ig1);
	re.setI(li);
	assertEquals(li1,re.getI());
	} @Test
	void testRecipeentityLocalDateTimeIntStringListOfIngredientsentityStringBooleanString() {
	Ingredients ig=new Ingredients("popcornseeds");
	List<Ingredients> lii=new ArrayList<>();
	lii.add(ig);
	LocalDateTime date =LocalDateTime.parse("2022-04-23T16:01:21.335017");
	Recipe rec1=new Recipe(1,"Apple","Veg",3,"ABCEDEF",lii);
	}
	@Test
	void testRecipeentity() {
	}
	@Test
	void testTostring() {
	Ingredients ig=new Ingredients("popcornseeds");
	List<Ingredients> lii=new ArrayList<>();
	lii.add(ig);
	LocalDateTime date =LocalDateTime.parse("2022-04-25T16:01:21.335017");
	Recipe rec1=new Recipe(1,"Apple","Veg",3,"ABCEDEF",lii);

	rec1.getDateTime();
	rec1.getId();
	rec1.getRecipename();
	rec1.getI();
	rec1.getInstructions();
	rec1.getVegornonveg();
	rec1.getNoofservings();
	//assertEquals(rec1.getIngredients(),rec2.getIngredients());
	}}

