package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.sendgrid.SendGridProperties.Proxy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Day1Aop2Application {

	public static void main(String[] args) {
		
		System.out.println("hello world");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContrext.xml");
		A a=(A)context.getBean("proxy");
		
		a.Aman();
			
	}

}
