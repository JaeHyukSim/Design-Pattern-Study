
public class Waitress {

	Menu pancakeHouseMenu;
	Menu dinerMenu;
	Iterator iterator;
	
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu() {
		Iterator pancIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		System.out.println("메뉴\n----\n아침식사");
		printMenu(pancIterator);
		System.out.println("\n점심식사\n");
		printMenu(dinerIterator);
	}
	
	private void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.println(menuItem.getName() + ", ");
			System.out.println(menuItem.getPrice() + ", ");
			System.out.println(menuItem.getDescription() + " -- ");
		}
	}
}
