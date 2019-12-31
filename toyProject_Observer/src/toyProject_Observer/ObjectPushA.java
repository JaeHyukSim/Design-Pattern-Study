package toyProject_Observer;

public class ObjectPushA implements Observer, Display{
	private String mapData;
	private String characterData;
	private String fundData;
	private long dateData;
	private DataCenter dataCenter;
	private boolean check;
	
	public ObjectPushA(DataCenter dc) {
		check = false;
		dataCenter = dc;
	}
	public void registerObserver() {
		dataCenter.registerObserver(this);
	}
	public boolean isCheck() {
		long tmp = dataCenter.getDateData();
		if(dateData != tmp) {
			check = true;
		}
		return check;
	}
	public void update(String m, String c, String f, long d) {
		if(isCheck() == true) {
			mapData = m;
			characterData = c;
			dateData = d;
			fundData = f;
			check = false;
		}
	}
	public void display() {
		System.out.printf("map data : %s\n", mapData);
		System.out.printf("character data : %s\n", characterData);
		System.out.printf("date data : %s\n", dateData);
		System.out.printf("fund data : %s\n", fundData);
	}
}
