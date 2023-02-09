package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con= new ClassPathXmlApplicationContext("com/springcore/ci/configCI.xml");
        Person p = (Person)con.getBean("P1");
        System.out.println(p);
        
        Addition add= (Addition)con.getBean("add");
        add.sum();
        
	}

}
