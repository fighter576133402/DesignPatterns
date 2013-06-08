package cn.com.fighter.weatherstation.display;

import java.util.Observable;
import java.util.Observer;

import cn.com.fighter.weatherstation.WeatherData;
import cn.com.fighter.weatherstation.WeatherDataUtil;
import cn.com.fighter.weatherstation.controler.DisplayElement;

public class CurrentConditionsDisplayUtil implements Observer,DisplayElement{
	Observable observable ;
	private float temperature ;
	private float humidity;
	
	public CurrentConditionsDisplayUtil(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current Conditions:"+temperature +"F degrees and " + humidity +"%humidity");
	}

	@Override
	public void update(Observable obs, Object arg1) {
		// TODO Auto-generated method stub
		if(obs instanceof WeatherDataUtil){
			WeatherDataUtil weatherDataUtil = (WeatherDataUtil)obs;
			this.temperature = weatherDataUtil.getTemperature();
			this.humidity = weatherDataUtil.getHumidity();
			display();
		}
	}

}
