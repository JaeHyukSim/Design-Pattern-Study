package toyProject_Observer;

public class ObjectPushC implements Observer, Display{
	private String mapData;
	private String characterData;
	private String fundData;
	private long dateData;
	private DataCenter dataCenter;
	private boolean check;
	
	public ObjectPushC(DataCenter dc) {
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
		System.out.printf("!!!!!!!!!!!%s!!!!!!!!!!!\n", mapData);
		System.out.printf("!!!!!!!!!!!%s!!!!!!!!!!!\n", characterData);
		System.out.printf("!!!!!!!!!!!%s!!!!!!!!!!!\n", dateData);
		System.out.printf("!!!!!!!!!!!%s!!!!!!!!!!!\n", fundData);
	}
}
