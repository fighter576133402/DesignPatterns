package cn.com.fighter.coffee.specificcomponents;

import cn.com.fighter.coffee.abstractcomponents.Beverage;
/**
 * 可以被装饰者包起来的具体组件
 * @author Fighter
 *
 */
public class HouseBlend extends Beverage {

	public HouseBlend(){
		description = "House Blend Coffee";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .98;
	}

}
