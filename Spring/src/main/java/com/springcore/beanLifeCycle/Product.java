package com.springcore.beanLifeCycle;

//using xml configuration
public class Product {
	private double price;

	
	public Product() {
		super();
	}

	public Product(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [price=" + price + "]";
	}
	

	public void init() {
		System.out.println("Inside init method");
	}
	public void destroy() {
		System.out.println("Inside destory method");
	}
	

}
