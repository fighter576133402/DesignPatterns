package cn.com.fighter.factory.abstractfactory.areaingredient;

import cn.com.fighter.factory.abstractfactory.areaingredient.entity.Cheese;
import cn.com.fighter.factory.abstractfactory.areaingredient.entity.Clams;
import cn.com.fighter.factory.abstractfactory.areaingredient.entity.Dough;
import cn.com.fighter.factory.abstractfactory.areaingredient.entity.Pepperoni;
import cn.com.fighter.factory.abstractfactory.areaingredient.entity.Sauce;
import cn.com.fighter.factory.abstractfactory.areaingredient.entity.Veggies;

public interface PizzaIngredientFactory {
	public Cheese createCheese();
	public Clams createClams();
	public Dough createDough();
	public Pepperoni createPepperoni();
	public Sauce createSauce();
	public Veggies[] createVeggies();
}
