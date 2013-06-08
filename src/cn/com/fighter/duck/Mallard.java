package cn.com.fighter.duck;

import cn.com.fighter.duck.Behavior.behaviorImpl.FlyWithWinds;
import cn.com.fighter.duck.Behavior.behaviorImpl.Quack;

public class Mallard extends Duck {
	public Mallard (){
		flyBehavior = new FlyWithWinds();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am  a realy Mallard duck!");
	}
}
