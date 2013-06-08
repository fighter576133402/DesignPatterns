package cn.com.fighter.duck;

import cn.com.fighter.duck.Behavior.behaviorImpl.FlyRocketPowered;
/**
 * 
 * @author Fighter
 *
 */
public class Main {
	
	public static void main(String args[]){
		Duck mallardDuck = new Mallard();
		mallardDuck.performFlay();
		mallardDuck.setFlyBehavior(new FlyRocketPowered());
		mallardDuck.performFlay();
		mallardDuck.performQuack();
		
	}
}
