package com.streams.groupby.sort;

public class Product {
private String name;
private int qty;
private float price;
public Product(String name, float price, int qty) {
	super();
	this.name = name;
	this.price = price;
	this.qty = qty;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [name=" + name + ", qty=" + qty + ", price=" + price + "]";
}

}
