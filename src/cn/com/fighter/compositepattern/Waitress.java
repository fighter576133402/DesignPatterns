package cn.com.fighter.compositepattern;

import java.util.Iterator;

import cn.com.fighter.compositepattern.menu.MenuComponent;

public class Waitress {
	MenuComponent allMenus;
	public Waitress(MenuComponent allMenus){
		this.allMenus = allMenus;
	}
	public void printMenu(){
		allMenus.print();
	}
	
	//
	public void printVegetarianMenu(){
		Iterator iterator = allMenus.createIterator();
		
		System.out.println("\nVEGETARIAN MEMU\n------");
		//遍历组合内的每个元素
		while(iterator.hasNext()){
			MenuComponent menuComponent = (MenuComponent)iterator.next();
			try {
				//调用每个元素的isVegetarian()方法，
				//如果为true，就调用它的print方法
				if(menuComponent.isVegetarian()){
					menuComponent.print();
				}
			} catch (UnsupportedOperationException e) {
				//只有菜单项的print()方法可以被调用，绝对不能调用菜单的print方法
				// TODO: handle exception
			}
			
			
		}
	}
	
}
