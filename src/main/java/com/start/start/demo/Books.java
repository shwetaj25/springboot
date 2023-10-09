package com.start.start.demo;

public class Books {
	private String name;
	private int Id;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Books [name=" + name + ", Id=" + Id + ", price=" + price + "]";
	}
	public Books(String name, int id, int price) {
		super();
		this.name = name;
		Id = id;
		this.price = price;
	}
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
