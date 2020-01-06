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
	}

}
