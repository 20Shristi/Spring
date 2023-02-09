package com.springcore.beanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exercise {

	public static void main(String[] args) {
		
		AbstractApplicationContext con = new ClassPathXmlApplicationContext("/com/springcore/beanLifeCycle/config.xml");
//        Product p= (Product)con.getBean("product");
//        System.out.println(p);
//        System.out.println("*************************************");
//       
//        Product2 p2= (Product2)con.getBean("product2");
//	     System.out.println(p2);
		
		Product3 p= (Product3)con.getBean("product3");
        System.out.println(p);
	     
		 con.registerShutdownHook(); // registering shutdown hook - to call destroy method.
		
		 
	     
	}

}
