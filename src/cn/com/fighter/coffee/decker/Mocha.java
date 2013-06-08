package cn.com.fighter.coffee.decker;

import cn.com.fighter.coffee.abstractcomponents.Beverage;

public class Mocha extends CondimentDecorator {
	Beverage beverage;
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		System.out.println("mocha");
		return .20 + beverage.cost();
	}

}
