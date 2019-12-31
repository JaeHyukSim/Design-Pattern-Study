package observerPattern_Example;

public class AddedUserDisplay implements ObserverEx, Display{
	private double temperature;
	private double pressure;
	private double currentState;
	private Station station;
	
	public AddedUserDisplay(Station st) {
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
		System.out.println("User Display Here! ...");
		System.out.println("// temper :: " + temperature + "//... something");
	}
}
