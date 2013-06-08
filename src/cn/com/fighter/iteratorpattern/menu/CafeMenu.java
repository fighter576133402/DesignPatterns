package cn.com.fighter.iteratorpattern.menu;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu{
	Hashtable menuItems = new Hashtable();
	public CafeMenu(){
		addItem("Veggie Burger and Air Fries", "Veggie burger on a whole bun , lettuce ,tomato , and fries", true, 3.99);
	}
	public void addItem(String name,String description,boolean vegetarian,double price){
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuItem.getName(), menuItem);
	}
	@Override
	public Iterator creatIterator() {
		// TODO Auto-generated method stub
		
		return menuItems.values().iterator();
	}
}
