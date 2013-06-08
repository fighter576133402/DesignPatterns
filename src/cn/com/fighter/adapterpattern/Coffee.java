package cn.com.fighter.adapterpattern;

public class Coffee extends CaffeineBeverang {

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("dripping coffee through filter");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("adding sugar and milk");
	}

}
