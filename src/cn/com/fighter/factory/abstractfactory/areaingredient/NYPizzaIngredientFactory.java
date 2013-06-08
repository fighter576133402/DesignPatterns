package cn.com.fighter.factory.abstractfactory.areaingredient;

import cn.com.fighter.factory.abstractfactory.areaingredient.entity.Cheese;
import cn.com.fighter.factory.abstractfactory.areaingredient.entity.Clams;
import cn.com.fighter.factory.abstractfactory.areaingredient.entity.Dough;
import cn.com.fighter.factory.abstractfactory.areaingredient.entity.Pepperoni;
import cn.com.fighter.factory.abstractfactory.areaingredient.entity.Sauce;
import cn.com.fighter.factory.abstractfactory.areaingredient.entity.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		System.out.println("nycheese");
		return null;
	}

	@Override
	public Clams createClams() {
		// TODO Auto-generated method stub
		System.out.println("nyclams");
		return null;
	}

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		System.out.println("nydough");
		return null;
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		System.out.println("nypepperoni");
		return null;
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		System.out.println("nysauce");
		return null;
	}

	@Override
	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		System.out.println("nyveggies");
		return null;
	}

}
