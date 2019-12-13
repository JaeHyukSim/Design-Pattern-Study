package observerPattern_Example;

public interface Observable {
	public void registerObserver(ObserverEx o);
	public void removeObserver(ObserverEx o);
	public void notifyObserver();
}
