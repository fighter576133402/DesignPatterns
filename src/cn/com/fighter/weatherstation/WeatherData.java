package cn.com.fighter.weatherstation;

import java.util.ArrayList;

import cn.com.fighter.weatherstation.controler.Observer;
import cn.com.fighter.weatherstation.controler.Subject;

public class WeatherData implements Subject {

	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if(i>=0){
			observers.remove(i);
		}
	}

	@Override
	public void motifyObserver() {
		// TODO Auto-generated method stub
		int size=observers.size();
		
		for(int i=0;i<size;i++){
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

	public void measurementsChanged(){
		motifyObserver();
	}
	
	public void setMeasurements(float temperature,float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
