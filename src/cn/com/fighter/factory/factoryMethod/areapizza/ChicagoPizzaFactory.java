package cn.com.fighter.factory.factoryMethod.areapizza;

import cn.com.fighter.factory.factoryMethod.Pizza;
import cn.com.fighter.factory.factoryMethod.PizzaStore;
import cn.com.fighter.factory.factoryMethod.areapizza.chicagopizza.ChicagoSytleCheesePizza;
import cn.com.fighter.factory.factoryMethod.areapizza.chicagopizza.ChicagoSytlePepperoniPizza;
import cn.com.fighter.factory.factoryMethod.areapizza.chicagopizza.ChicagoSytlePlamPizza;
import cn.com.fighter.factory.factoryMethod.areapizza.chicagopizza.ChicagoSytleVeggiePizza;

public class ChicagoPizzaFactory extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if(type.equals("cheese")){
			return new ChicagoSytleCheesePizza();
		}else if(type.equals("pepperoni")){
			return new ChicagoSytlePepperoniPizza();
		}else if(type.equals("plam")){
			return new ChicagoSytlePlamPizza();
		}else if(type.equals("veggie")){
			return new ChicagoSytleVeggiePizza();
		}
		return null;
	}



}
