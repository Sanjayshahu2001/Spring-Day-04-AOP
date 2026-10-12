package com.example.demo;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MybeforeAdv implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		
		
		System.out.println("Welcome to  Before");
	}
	

	

}
