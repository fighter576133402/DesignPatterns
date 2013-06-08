package cn.com.fighter.factory.factoryMethod;

public abstract class PizzaStore {
	public Pizza orderPizza(String type){
		Pizza pizza;
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	//���ڣ�ʵ�������������α��Ƶ�һ�����������У��˷�������ͬһ������
	public abstract Pizza createPizza(String type);
}
