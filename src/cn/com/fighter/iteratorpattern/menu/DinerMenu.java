package cn.com.fighter.iteratorpattern.menu;
import java.util.Iterator;

import cn.com.fighter.iteratorpattern.iterator.DinerMenuIterator;
public class DinerMenu implements Menu{
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem [] menuItems ;
	
	public DinerMenu(){
		menuItems = new MenuItem [MAX_ITEMS];
		addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
	}
	
	public void addItem(String name,String description,boolean vegetarian,double price){
		MenuItem menuItem =  new MenuItem(name, description, vegetarian, price);
		if(numberOfItems >=MAX_ITEMS){
			System.err.println("Sorry , menu is full! Can't add item to menu.");
		}else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems +1;
		}
	}
	
	public Iterator creatIterator(){
		return new DinerMenuIterator(menuItems);
	}
}
