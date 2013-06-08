package cn.com.fighter.iteratorpattern;

import java.util.ArrayList;

import cn.com.fighter.iteratorpattern.menu.CafeMenu;
import cn.com.fighter.iteratorpattern.menu.DinerMenu;
import cn.com.fighter.iteratorpattern.menu.PancakeHouseMenu;

/**
 * µü´úÆ÷Ä£Ê½
 * @author Fighter
 *
 */
public class Main {
	public static void main(String []args){
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();
		ArrayList menu = new ArrayList();
		menu.add(pancakeHouseMenu);
		menu.add(dinerMenu);
		menu.add(cafeMenu);
		Waitress waitress = new Waitress(menu);
		waitress.printMenu();
	}
}
