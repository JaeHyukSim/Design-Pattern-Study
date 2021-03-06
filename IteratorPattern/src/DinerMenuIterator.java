
public class DinerMenuIterator implements Iterator{

	private MenuItem[] items;
	private int position = 0;
	
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}
	@Override
	public boolean hasNext() {
		if(position >= items.length || items[position] == null) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
