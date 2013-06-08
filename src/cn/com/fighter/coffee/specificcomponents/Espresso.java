package cn.com.fighter.coffee.specificcomponents;

import cn.com.fighter.coffee.abstractcomponents.Beverage;

/**
 * Å¨Ëõ¿§·È
 * @author Fighter
 *
 */
public class Espresso extends Beverage {

	
	public Espresso(){
		description = "Espresso";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}

}
