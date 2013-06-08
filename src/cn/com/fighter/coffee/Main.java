package cn.com.fighter.coffee;

import cn.com.fighter.coffee.abstractcomponents.Beverage;
import cn.com.fighter.coffee.decker.Mocha;
import cn.com.fighter.coffee.decker.Soy;
import cn.com.fighter.coffee.decker.Whip;
import cn.com.fighter.coffee.specificcomponents.Espresso;
import cn.com.fighter.coffee.specificcomponents.HouseBlend;

/**
 * 装饰者模式
 * @author Fighter
 *
 */
public class Main {

	public static void main(String [] args){
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" +beverage.cost());
		
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Soy(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" +beverage2.cost());
	}
}
