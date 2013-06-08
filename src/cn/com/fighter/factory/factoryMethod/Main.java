package cn.com.fighter.factory.factoryMethod;

import cn.com.fighter.factory.factoryMethod.areapizza.ChicagoPizzaFactory;
import cn.com.fighter.factory.factoryMethod.areapizza.NYPizzaFactory;
/**
 * 工厂方法
 * @author Fighter
 *
 */

public class Main {
	public static void main(String [] args){
		PizzaStore nyStore = new NYPizzaFactory();
		PizzaStore chicagoPizzaStore = new ChicagoPizzaFactory();
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("first pizza "+pizza.name);
		
		pizza = chicagoPizzaStore.orderPizza("cheese");
		System.out.println("second pizza "+ pizza.name);
	}
}
