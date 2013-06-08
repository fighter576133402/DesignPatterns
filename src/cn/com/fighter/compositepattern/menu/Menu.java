package cn.com.fighter.compositepattern.menu;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
	ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	String name ;
	String description;
	public Menu(String name , String desString){
		this.name = name;
		this.description = desString;
	}
	@Override
	public void add(MenuComponent menuComponent) {
		// TODO Auto-generated method stub
		menuComponents.add(menuComponent);
	}
	@Override
	public void remove(MenuComponent menuComponent) {
		// TODO Auto-generated method stub
		menuComponents.remove(menuComponent);
	}
	@Override
	public MenuComponent getChild(int i) {
		// TODO Auto-generated method stub
		return menuComponents.get(i);
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("\n"+getName());
		System.out.println(", "+getDescription());
		System.out.println("-------------------");
		
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while(iterator.hasNext()){
			MenuComponent menuComponent = (MenuComponent)iterator.next();
			menuComponent.print();
		}
	}
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new CompositeIterator(menuComponents.iterator());
	}
	
	
}
