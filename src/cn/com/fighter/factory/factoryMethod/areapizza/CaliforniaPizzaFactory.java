package cn.com.fighter.factory.factoryMethod.areapizza;

import cn.com.fighter.factory.factoryMethod.Pizza;
import cn.com.fighter.factory.factoryMethod.PizzaStore;

public class CaliforniaPizzaFactory extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if(type.equals("cheese")){
			
		}else if(type.equals("pepperoni")){
			
		}else if(type.equals("plam")){
			
		}else if(type.equals("veggie")){
			
		}
		return null;
	}

	

}
