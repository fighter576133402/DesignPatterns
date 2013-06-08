package cn.com.fighter.factory.abstractfactory;

import cn.com.fighter.factory.abstractfactory.areastore.PizzaStore;
import cn.com.fighter.factory.abstractfactory.areastore.NYPizzaStore;
import cn.com.fighter.factory.abstractfactory.pizza.Pizza;

/**
 * ³éÏó¹¤³§
 * @author Fighter
 *
 */
public class Main {
	public static void main(String [] args){
		PizzaStore store = new NYPizzaStore();
		Pizza pizza= store.orderPizza("cheese");
		System.out.println("first pizza "+pizza.name);
		
	}
}
