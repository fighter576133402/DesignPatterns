package cn.com.fighter.singletonpattern;
/**
 * 双重检查加锁
 * @author Fighter
 * 适用java1.4以上的不包括1.4 也就是java5才支持volatile
 */
public class Singleton {
	/**
	 * volatile 关键词确保：
	 * 			当uniqueInstance被初始化为实例时，
	 * 			多个线程正确的处理uniqueInstance
	 * 			变量
	 */
	private volatile static Singleton uniqueInstance;
	private Singleton (){};
	public static Singleton getInstance(){
		if(uniqueInstance ==null){
			synchronized (Singleton.class) {
				if(uniqueInstance == null){
					uniqueInstance = new Singleton();
				}
			}
			
		}
		return uniqueInstance;
	}
}
