package com.qa.persistence.domain;

public class Item {
	private int id;
	private String name;
	private int value;
	
	public Item(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public Item(int id, String name, int value) {
		this.id = id;
		this.name = name;
		this.value = value;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public String toString() {
		return "id:" + id + " name:" + name + " value:" + value;
	}

}

