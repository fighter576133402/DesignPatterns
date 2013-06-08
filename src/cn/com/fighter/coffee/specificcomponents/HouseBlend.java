package cn.com.fighter.coffee.specificcomponents;

import cn.com.fighter.coffee.abstractcomponents.Beverage;
/**
 * ���Ա�װ���߰������ľ������
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
