package observerPattern_Example;

public class CurrentDisplay implements ObserverEx, Display{
	private double temperature;
	private double pressure;
	private double currentState;
	private Station station;
	
	public CurrentDisplay(Station st) {
		this.station = st;
		st.registerObserver(this);
	}
	public void update(double temper, double pres, double curr) {
		this.temperature = temper;
		this.pressure = pres;
		this.currentState = curr;
	}
	public void removeMe() {
		station.removeObserver(this);
	}
	public void display() {
		System.out.print("current state :((temper * 2) + (pressure * 3)) / currentState ... ::");
		System.out.println(((temperature * 2) + (pressure * 3)) / currentState);
	}
}
