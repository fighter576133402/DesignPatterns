package cn.com.fighter.duck.Behavior.behaviorImpl;

import cn.com.fighter.duck.Behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I can not fly!");
	}

}
