package observerPattern_Example;

public class ExecuteMain {

	public static void main(String[] args) {
		Station station = new Station();
		MainScreenDisplay mainScreenDisplay = new MainScreenDisplay(station);
		CurrentDisplay currentDisplay = new CurrentDisplay(station);
		AddedUserDisplay addedUserDisplay = new AddedUserDisplay(station);
		
		station.changedData(30, 40.5, 1028.7729);
		mainScreenDisplay.display();
		currentDisplay.display();
		addedUserDisplay.display();
		
		System.out.println();
		
		station.changedData(40, 77.7, 112164.354);
		mainScreenDisplay.display();
		currentDisplay.display();
		addedUserDisplay.display();
	}

}
