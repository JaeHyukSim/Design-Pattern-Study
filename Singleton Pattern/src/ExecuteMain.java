import sun.nio.cs.SingleByte;

public class ExecuteMain {

	public static void main(String[] args) {
		SingletonPattern sp = SingletonPattern.getInstance();
		System.out.println(sp.getData());
		sp.setData(150);
		System.out.println(sp.getData());
		//sp.getInstance();
		SingletonPattern sp3 = SingletonPattern.getInstance();
		//sp3.getInstance();
		System.out.println(sp3.getData());
		sp3 = SingletonPattern.getInstance();
		sp3 = SingletonPattern.getInstance();
		sp3 = SingletonPattern.getInstance();
		sp3 = SingletonPattern.getInstance();
		sp3 = SingletonPattern.getInstance();
		sp3 = SingletonPattern.getInstance();
		sp3 = SingletonPattern.getInstance();
		sp3 = SingletonPattern.getInstance();
		try {
			SingletonPattern sp4 = (SingletonPattern)sp3.clone();
			sp4.setData(20);
			System.out.println(sp4.getData());
			System.out.println(sp3.getData());
			System.out.println(sp.getData());
			sp.setData(30);
			System.out.println(sp4.getData());
			System.out.println(sp3.getData());
			System.out.println(sp.getData());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
