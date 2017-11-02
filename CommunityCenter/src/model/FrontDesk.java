package model;

import java.util.LinkedList;

public class FrontDesk {
	private int desk_id;
	private LinkedList<DeskItem> desk_items;
	
	public FrontDesk(int id) {
		desk_id = id;
	}
	
	public void addDeskItem(DeskItem item) {
		desk_items.add(item);
	}
	
	public DeskItem getDeskItem(int index) {
		if (desk_items.size() <= index) {
			return null;
		}
		else {
			return desk_items.get(index);
		}
	}
	
	public void updateDeskItemState(ItemState state) {
		
	}
}
