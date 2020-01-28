import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator{

	private ArrayList<MenuItem> items;
	private int position = 0;
	public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}
	@Override
	public boolean hasNext() {
		if(position >= items.size() || items.get(position) == null) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		MenuItem menuItem = items.get(position);
		position += 1;
		return menuItem;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	//Concreted by array.

	
}
