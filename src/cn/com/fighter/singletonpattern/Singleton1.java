package cn.com.fighter.singletonpattern;
/**
 * 如果应用程序总是创建并使用单件实例，或者在创建和运行的负担不会太重，你可能
 * 想用急切的创建此单件
 * @author Fighter
 *
 */
public class Singleton1 {
	private volatile static Singleton1 uniqueInstance1 = new Singleton1();
	private Singleton1(){
		
	}
	
	public static Singleton1 getInstance(){
		return uniqueInstance1;
	}
}
