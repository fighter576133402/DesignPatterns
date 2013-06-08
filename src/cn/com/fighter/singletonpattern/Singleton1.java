package cn.com.fighter.singletonpattern;
/**
 * ���Ӧ�ó������Ǵ�����ʹ�õ���ʵ���������ڴ��������еĸ�������̫�أ������
 * ���ü��еĴ����˵���
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
