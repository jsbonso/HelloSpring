package com.tutorialsdojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * This is MisterBean, not the comedian, 
 * but the main class of our program. It will define the 
 * bean configuration file(spring.xml), call the 'hello' spring bean, 
 * set the value for <$message> and finally, output the value in the console.
 *
 */

public class MisterBean {

	public static void main(String[] args){
		
		//Declare spring.xml the bean configuration file.  
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring.xml");
		
		// Assign value to the <$message> variable. 
		Hello hello = (Hello) context.getBean("hello");
		hello.setMessage("Hello Sensei!");
		
		// Output the message
		System.out.println(hello.getMessage());
     
	}

}
