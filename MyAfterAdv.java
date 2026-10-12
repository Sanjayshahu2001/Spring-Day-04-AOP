package com.example.demo;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyAfterAdv implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
	System.out.println("Welcome to After Adv");
		
	}

}
