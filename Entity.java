package com.gamingroom;


public class Entity {
	private long id;
	private String name;
	
	public Entity() {}
	// Create ID and Name
	public Entity(long id, String name) {
		this.id = id;
		this.name = name;
	}
	// Getters
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Entity [id=" + id + ",name= "+ name + "]";
	}
}
