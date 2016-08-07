package com.liberation.entry;

public class Product {
	private String id; // ��Ʒ���
	private String name; // ��Ʒ����
	private double price; // ��Ʒ��Ǯ
	private int stock; // ��Ʒ���

	// ���캯��
	public Product(String id, String name, double price, int stock) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
