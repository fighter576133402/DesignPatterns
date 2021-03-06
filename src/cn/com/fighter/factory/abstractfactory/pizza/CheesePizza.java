package cn.com.fighter.factory.abstractfactory.pizza;

import cn.com.fighter.factory.abstractfactory.areaingredient.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory ;
	public CheesePizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparing "+ name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}

}
