package toyProject_Observer;

import java.util.ArrayList;

public class DataCenter implements Observable{
	
	private String mapData;
	private String characterData;
	private String fundData;
	private long dateData;
	private ArrayList observerList;
	private boolean check;
	
	public DataCenter() {
		observerList = new ArrayList();
		check = false;
	}
	public void registerObserver(Observer o) {
		observerList.add(o);
	}
	public void removeObserver(Observer o) {
		int i = observerList.indexOf(o);
		if(i != -1) {
			observerList.remove(i);
		}
	}
	public void notifyObserver() {
		Observer obPoint;
		for(int i = 0; i < observerList.size(); i++) {
			obPoint = (Observer)observerList.get(i);
			obPoint.update(mapData, characterData, fundData, dateData);
		}
	}
	public boolean isCheck() {
		return check;
	}
	public void checkOK() {
		check = true;
	}
	public void updateData(String m,String c, String f) {
		check = true;
		if(check == true) {
			mapData = m;
			dateData = System.currentTimeMillis(); 
			fundData = f; 
			characterData = c;
			check = false;
		}
	}
	
	public void notifyPrivateObserver(Observer o) {
		o.update(mapData, characterData, fundData, dateData);
	}
	public long getDateData() {
		return dateData;
	}
	public void setDateData(long dateData) {
		this.dateData = dateData;
	}
}
