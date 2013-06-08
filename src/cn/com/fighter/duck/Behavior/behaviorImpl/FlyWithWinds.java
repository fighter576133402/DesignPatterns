package cn.com.fighter.duck.Behavior.behaviorImpl;

import cn.com.fighter.duck.Behavior.FlyBehavior;

public class FlyWithWinds implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I am flying!");
	}

}
