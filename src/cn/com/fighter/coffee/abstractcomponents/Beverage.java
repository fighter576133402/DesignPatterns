package cn.com.fighter.coffee.abstractcomponents;
/**
 * ÒûÁÏ
 * @author Fighter
 *
 */
public abstract class Beverage {
	public String description = "Unknow beverage";

	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
