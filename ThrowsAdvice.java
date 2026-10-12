package com.example.demo;

public class ThrowsAdvice implements org.springframework.aop.ThrowsAdvice{
	
	  public void afterThrowing(Exception ex){  
	        System.out.println("additional exception");  
	    }  
	  
	
	

}
