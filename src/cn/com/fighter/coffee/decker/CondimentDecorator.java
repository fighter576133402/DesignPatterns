package cn.com.fighter.coffee.decker;

import cn.com.fighter.coffee.abstractcomponents.Beverage;

/**
 * 调料抽象装饰者
 * @author Fighter
 *
 */
public abstract class CondimentDecorator extends Beverage {

	public abstract String getDescription();

}
