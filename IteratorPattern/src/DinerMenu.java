
public class DinerMenu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
	}
	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}
}
