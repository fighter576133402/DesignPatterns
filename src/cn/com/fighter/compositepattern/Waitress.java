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
		//��������ڵ�ÿ��Ԫ��
		while(iterator.hasNext()){
			MenuComponent menuComponent = (MenuComponent)iterator.next();
			try {
				//����ÿ��Ԫ�ص�isVegetarian()������
				//���Ϊtrue���͵�������print����
				if(menuComponent.isVegetarian()){
					menuComponent.print();
				}
			} catch (UnsupportedOperationException e) {
				//ֻ�в˵����print()�������Ա����ã����Բ��ܵ��ò˵���print����
				// TODO: handle exception
			}
			
			
		}
	}
	
}
