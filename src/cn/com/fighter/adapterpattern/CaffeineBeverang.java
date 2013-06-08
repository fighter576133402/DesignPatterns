package cn.com.fighter.adapterpattern;

public abstract class CaffeineBeverang {
	final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	abstract void brew();
	abstract void addCondiments();
	void boilWater(){
		System.out.println("Boil Water");
	}
	void pourInCup(){
		System.out.println("Pour In Cup");
	}
}
