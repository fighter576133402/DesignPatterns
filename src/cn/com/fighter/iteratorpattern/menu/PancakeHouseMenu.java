package cn.com.fighter.iteratorpattern.menu;

import java.util.ArrayList;
import java.util.Iterator;


public class PancakeHouseMenu implements Menu {
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu(){
		menuItems = new ArrayList<MenuItem>();
		addItem("K&B's Pancake Breakfirst", "Pancakes with fried eggs, and toast", true, 2.99);
	}
	public void addItem(String name,String description,boolean vegetarian,double price){
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	public Iterator creatIterator(){
		return menuItems.iterator();
	}
}
