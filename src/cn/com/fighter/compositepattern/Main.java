package cn.com.fighter.compositepattern;



import cn.com.fighter.compositepattern.menu.Menu;
import cn.com.fighter.compositepattern.menu.MenuComponent;
import cn.com.fighter.compositepattern.menu.MenuItem;

/**
 * 组合模式
 * @author Fighter
 *
 */
public class Main {
	public static void main(String [] args){
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU","Breakfirst");
		MenuComponent dinerMenu = new Menu("DINER MENU","Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU","Dinner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU","Dessert of course");
		
		MenuComponent allMenus = new Menu("ALL MENUS","All menus combined");
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		
		pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfirst", "Pancakes with fried eggs, and toast", true, 2.99));
		dinerMenu.add(new MenuItem("Pasta","Spaghetti with Marinara Sauce, and a slice of sourdough bread",true,3.99));
		dinerMenu.add(dessertMenu);
		//dessertMenu.add(new MenuItem("Apple pie", "Apple pie with a falkey crust , topped with vanilla ice cream", true, 1.59));
		dessertMenu.add(new MenuItem("Banana pie", "Banana pie with a falkey crust , topped with vanilla ice cream", true, 1.59));
		cafeMenu.add(new MenuItem("Veggie Burger and Air Fries", "Veggie burger on a whole bun , lettuce ,tomato , and fries", true, 3.99));
		
		Waitress waitress = new Waitress(allMenus);
		//waitress.printMenu();
		waitress.printVegetarianMenu();
	}
}
