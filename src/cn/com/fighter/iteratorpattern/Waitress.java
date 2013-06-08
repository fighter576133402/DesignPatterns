package cn.com.fighter.iteratorpattern;
import java.util.ArrayList;
import java.util.Iterator;

import cn.com.fighter.iteratorpattern.menu.Menu;
import cn.com.fighter.iteratorpattern.menu.MenuItem;
public class Waitress {
	ArrayList menus;
	
	public Waitress(ArrayList menus){
		this.menus = menus;
	}
	
	public void printMenu(){
		Iterator menuIterator = menus.iterator();
		while(menuIterator.hasNext()){
			Menu menu = (Menu)menuIterator.next();
			printMenu(menu.creatIterator());
		}
	}
	public void printMenu(Iterator iterator){
		while(iterator.hasNext()){
			MenuItem item =(MenuItem) iterator.next();
			System.out.print(item.getName()+", ");
			System.out.print(item.getPrice()+" -- ");
			System.out.println(item.getDescription());
		}
	}
}
