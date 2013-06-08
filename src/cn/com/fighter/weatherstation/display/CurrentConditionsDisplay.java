package cn.com.fighter.weatherstation.display;

import cn.com.fighter.weatherstation.controler.DisplayElement;
import cn.com.fighter.weatherstation.controler.Observer;
import cn.com.fighter.weatherstation.controler.Subject;
/**
 * 一个气象模块
 * @author Fighter
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature ;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current Conditions:"+temperature +"F degrees and " + humidity +"%humidity");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temp ;
		this.humidity = humidity;
		display();
	}

}
