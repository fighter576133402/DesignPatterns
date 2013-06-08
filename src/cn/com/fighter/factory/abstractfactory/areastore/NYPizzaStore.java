package cn.com.fighter.factory.abstractfactory.areastore;


import cn.com.fighter.factory.abstractfactory.areaingredient.NYPizzaIngredientFactory;
import cn.com.fighter.factory.abstractfactory.areaingredient.PizzaIngredientFactory;
import cn.com.fighter.factory.abstractfactory.pizza.CheesePizza;
import cn.com.fighter.factory.abstractfactory.pizza.Pizza;


public class NYPizzaStore extends PizzaStore{
	Pizza pizza = null;
	PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if(type.equals("cheese")){
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("New York Style Cheese Pizaa");
		}
		return pizza;
	}

}
