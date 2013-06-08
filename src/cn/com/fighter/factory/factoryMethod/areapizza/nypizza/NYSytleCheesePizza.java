package cn.com.fighter.factory.factoryMethod.areapizza.nypizza;

import cn.com.fighter.factory.factoryMethod.Pizza;

public class NYSytleCheesePizza extends Pizza{
	public NYSytleCheesePizza (){
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Sauce";
		sauce = "Marinara Sauce";
		toppings.add("Grated Reggiano Cheese");
	}
}
