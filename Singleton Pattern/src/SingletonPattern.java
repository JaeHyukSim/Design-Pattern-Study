
public class SingletonPattern {
	private static volatile SingletonPattern instance = null;
	
	private int data;
	
	private SingletonPattern() {
		System.out.println("im������");
		data = 10;
	};
	
	public static SingletonPattern getInstance() {
		if(instance == null) {
			synchronized (SingletonPattern.class) {
				if(instance == null) {
					instance = new SingletonPattern();
				}
			}
		}
		return instance;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
}
