package cn.com.fighter.coffee.decker;

import cn.com.fighter.coffee.abstractcomponents.Beverage;

public class Whip extends CondimentDecorator {
	Beverage beverage;
	public Whip(Beverage beverage){
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		System.out.println("whip");
		return beverage.cost() + .15;
	}

}
