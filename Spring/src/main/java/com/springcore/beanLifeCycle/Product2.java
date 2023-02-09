package com.springcore.beanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// using interfaces
public class Product2 implements InitializingBean, DisposableBean {
       private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
    
	public Product2() {
		
	}
	public Product2(int price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product2 [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//init
		System.out.println("init method using interface");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//destroy
		System.out.println("destroy methpod using inetrface");
		
	}
       
	
       
}
