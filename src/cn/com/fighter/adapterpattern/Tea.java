package cn.com.fighter.adapterpattern;

public class Tea extends CaffeineBeverang {

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("Steeping the tea");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding Lemon");
	}

}
