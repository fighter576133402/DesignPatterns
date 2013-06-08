package cn.com.fighter.weatherstation;

import cn.com.fighter.weatherstation.display.CurrentConditionsDisplay;
import cn.com.fighter.weatherstation.display.CurrentConditionsDisplayUtil;
/**
 * 观察者模式
 * @author Fighter
 *
 */
public class Main {
	public static void main(String args []){
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 53.2f);
		
		WeatherDataUtil weatherDataUtil = new WeatherDataUtil();
		CurrentConditionsDisplayUtil conditionsDisplayUtil = new CurrentConditionsDisplayUtil(weatherDataUtil);
		weatherDataUtil.setMeasurements(70, 60, 50.0f);
		
	}
}
