package com.triffil;


public class ExceptionSuper {
	void msg(){System.out.println("parent");}  
	}  
	  
	class TestExceptionChild extends ExceptionSuper{  
	  void msg()throws ArithmeticException 
	  {  
	    System.out.println("TestExceptionChild");  
	  }  
	  public static void main(String args[]){  
	   ExceptionSuper p=new TestExceptionChild();  
	   p.msg();  
	   
	  }  
	}