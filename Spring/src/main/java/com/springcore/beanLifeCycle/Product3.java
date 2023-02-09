package com.springcore.beanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// using annotations
public class Product3 {
      private String item;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
	

	public Product3() {
		super();
	}

	public Product3(String item) {
		super();
		this.item = item;
	}

	@Override
	public String toString() {
		return "Product3 [item=" + item + "]";
	}
     
	@PostConstruct
	public void start() {
		System.out.println("starting method");
	}
	@PreDestroy
	public void end() {
		System.out.println("ending method");
	}
      
}
