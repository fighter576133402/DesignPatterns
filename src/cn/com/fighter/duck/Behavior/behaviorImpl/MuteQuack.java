package cn.com.fighter.duck.Behavior.behaviorImpl;

import cn.com.fighter.duck.Behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Silence!");
	}

}