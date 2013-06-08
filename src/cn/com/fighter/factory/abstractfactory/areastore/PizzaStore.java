package cn.com.fighter.factory.abstractfactory.areastore;

import cn.com.fighter.factory.abstractfactory.pizza.Pizza;

public abstract class PizzaStore {
	public Pizza orderPizza(String type){
		Pizza pizza;
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	//现在，实例化比萨的责任被移到一个“方法”中，此方法就如同一个工厂
	public abstract Pizza createPizza(String type);
}
