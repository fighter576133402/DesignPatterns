package cn.com.fighter.factory.factoryMethod;

import java.util.ArrayList;

public abstract class Pizza {
	public String name;
	public String dough;
	public String sauce;
	
	public ArrayList toppings = new ArrayList();
	public void prepare(){
		System.out.println("Preparing "+name);
		System.out.println("Tossing dough...");
		System.out.println("Adding cauce...");
		System.out.println("Adding toppings:");
		int size = toppings.size();
		for (int i = 0 ; i <size ; i ++){
			System.out.println("   " +toppings.get(i));
		}
	}
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
}
