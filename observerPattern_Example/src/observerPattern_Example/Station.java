package observerPattern_Example;

import java.util.ArrayList;

public class Station implements Observable{
	
	private ArrayList observerList = new ArrayList();
	private double temperature;
	private double pressure;
	private double currentState;
	
	public Station() {
		observerList = new ArrayList();
	}
	public void registerObserver(ObserverEx o) {
		observerList.add(o);
	}
	public void removeObserver(ObserverEx o) {
		int i = observerList.indexOf(o);
		if(i != -1) {
			observerList.remove(i);
		}
	}
	public void notifyObserver() {
		for(int i = 0; i < observerList.size(); i++) {
			ObserverEx obPoint = (ObserverEx)observerList.get(i);
			obPoint.update(temperature, pressure, currentState);
		}
	}
	public void changedData(double t, double c, double p) {
		this.temperature = t;
		this.pressure = p;
		this.currentState = c;
		notifyObserver();
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getPressure() {
		return pressure;
	}
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	public double getCurrentState() {
		return currentState;
	}
	public void setCurrentState(double currentState) {
		this.currentState = currentState;
	}
	
}
