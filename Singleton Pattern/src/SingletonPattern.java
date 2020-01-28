
public class SingletonPattern implements Cloneable{
	private static volatile SingletonPattern instance = null;
	
	private int data;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

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
