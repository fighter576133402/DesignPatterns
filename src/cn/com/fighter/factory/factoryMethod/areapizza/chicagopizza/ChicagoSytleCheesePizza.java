package cn.com.fighter.factory.factoryMethod.areapizza.chicagopizza;

import cn.com.fighter.factory.factoryMethod.Pizza;

public class ChicagoSytleCheesePizza extends Pizza{
	public ChicagoSytleCheesePizza(){
		name = "Chicago Style deep dish Cheese Pizza";
		dough = "Extra Thick Crust Sauce";
		sauce = "Marinara Sauce";
		toppings.add("plum tomato sauce");
	}
	public void cut(){
		System.out.println("Cutting the pizza into square slices");
	}
	
}
