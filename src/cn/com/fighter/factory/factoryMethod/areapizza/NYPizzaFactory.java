package cn.com.fighter.factory.factoryMethod.areapizza;

import cn.com.fighter.factory.factoryMethod.Pizza;
import cn.com.fighter.factory.factoryMethod.PizzaStore;
import cn.com.fighter.factory.factoryMethod.areapizza.nypizza.NYSytleCheesePizza;
import cn.com.fighter.factory.factoryMethod.areapizza.nypizza.NYSytlePepperoniPizza;
import cn.com.fighter.factory.factoryMethod.areapizza.nypizza.NYSytlePlamPizza;
import cn.com.fighter.factory.factoryMethod.areapizza.nypizza.NYSytleVeggiePizza;

public class NYPizzaFactory extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if(type.equals("cheese")){
			return new NYSytleCheesePizza();
		}else if(type.equals("pepperoni")){
			return new NYSytlePepperoniPizza();
		}else if(type.equals("plam")){
			return new NYSytlePlamPizza();
		}else if(type.equals("veggie")){
			return new NYSytleVeggiePizza();
		}
		return null;
	}

	

}
