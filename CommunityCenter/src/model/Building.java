package model;

import java.util.LinkedList;

public class Building {
	private LinkedList<FrontDesk> community_centers;
	private String building_name;
	
	public Building(String name) {
		building_name = name;
	}
	
	public void addDesk(FrontDesk desk) {
		community_centers.add(desk);
	}
	
	public FrontDesk getDesk(int index) {
		if (community_centers.size() <= index){
			return null;
		}
		return community_centers.get(index);
	}
	

}
