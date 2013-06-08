package cn.com.fighter.singletonpattern;

public class Singleton2 {
	private volatile static Singleton2 uniqueInstance2;
	private Singleton2 (){};
	public static synchronized Singleton2 getInstance(){
		if(uniqueInstance2 == null){
			uniqueInstance2 = new Singleton2();
		}
		return uniqueInstance2;
	}
}
