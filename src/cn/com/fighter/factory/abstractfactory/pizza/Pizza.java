package cn.com.fighter.factory.abstractfactory.pizza;

import cn.com.fighter.factory.abstractfactory.areaingredient.entity.Cheese;
import cn.com.fighter.factory.abstractfactory.areaingredient.entity.Clams;
import cn.com.fighter.factory.abstractfactory.areaingredient.entity.Dough;
import cn.com.fighter.factory.abstractfactory.areaingredient.entity.Pepperoni;
import cn.com.fighter.factory.abstractfactory.areaingredient.entity.Sauce;
import cn.com.fighter.factory.abstractfactory.areaingredient.entity.Veggies;


public abstract class Pizza {
	public String name;
	public Dough dough;
	public Sauce sauce;
	public Veggies veggies[];
	public Cheese cheese;
	public Pepperoni pepperoni;
	public Clams clams;
	
	public abstract void prepare();
	public void bake (){
		System.out.println("Bake for 25 minutes at 350");
	}
	public void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	public void box(){
		System.out.println("Place pizza in official pizzaStore box");
	}
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
