package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ingredients {
	@Id
private String Ingredientsnames;
 
public String getIngredientsnames() {
	return Ingredientsnames;
}

public void setIngredientsnames(String ingredientsnames) {
	Ingredientsnames = ingredientsnames;
}

public Ingredients(String ingredientsnames) {
	super();
	Ingredientsnames = ingredientsnames;
}

public Ingredients() {
	super();
}

}
