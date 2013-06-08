package cn.com.fighter.singletonpattern;
/**
 * ˫�ؼ�����
 * @author Fighter
 * ����java1.4���ϵĲ�����1.4 Ҳ����java5��֧��volatile
 */
public class Singleton {
	/**
	 * volatile �ؼ���ȷ����
	 * 			��uniqueInstance����ʼ��Ϊʵ��ʱ��
	 * 			����߳���ȷ�Ĵ���uniqueInstance
	 * 			����
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
