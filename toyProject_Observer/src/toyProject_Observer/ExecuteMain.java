package toyProject_Observer;

public class ExecuteMain {

	public static void main(String[] args) {
		DataCenter dataCenter = new DataCenter();
		ObjectPushA objectA = new ObjectPushA(dataCenter);
		ObjectPushB objectB = new ObjectPushB(dataCenter);
		ObjectPushC objectC = new ObjectPushC(dataCenter);
		ObjectPullA objectPullA = new ObjectPullA(dataCenter);
		
		objectC.registerObserver();
		objectB.registerObserver();
		objectA.registerObserver();
		
		dataCenter.updateData("River", "Warrior", "100,000,00$");
		dataCenter.notifyObserver();
		
		objectA.display();
		objectB.display();
		objectC.display();
		dataCenter.notifyPrivateObserver(objectPullA);
		objectPullA.display();
		
		dataCenter.updateData("River", "Masician", "90,000,00$");
		dataCenter.notifyObserver();
		
		objectA.display();
		objectB.display();
		objectC.display();
		dataCenter.notifyPrivateObserver(objectPullA);
		objectPullA.display();
		
		dataCenter.removeObserver(objectA);
		
		dataCenter.updateData("R E V I S E D", "R E V I S E D", "R E V I S E D");
		dataCenter.notifyObserver();
		
		System.out.println();System.out.println();
		
		objectA.display();
		objectB.display();
		objectC.display();
		dataCenter.notifyPrivateObserver(objectPullA);
		objectPullA.display();
		
		System.out.println();System.out.println();
		
		objectA.display();
		objectB.display();
		objectC.display();
		objectPullA.display();
	}

}
