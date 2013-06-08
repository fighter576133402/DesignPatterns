package cn.com.fighter.coffee.decker;

import cn.com.fighter.coffee.abstractcomponents.Beverage;

/**
 * ¶¹½¬
 * @author Fighter
 *
 */
public class Soy extends CondimentDecorator {
	Beverage beverage;
	public Soy(Beverage beverage){
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		System.out.println("soy");
		return beverage.cost() + .10;
	}

}
