package model;

public class DeskItem {
	private String name;
	private int item_id;
	private ItemState item_state;
	
	public DeskItem(String item_name, Integer id, ItemState state) {
		name = item_name;
		item_id = id;
		item_state = state;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getItemID() {
		return item_id;
	}
	
	public ItemState getItemState() {
		return item_state;
	}
}
