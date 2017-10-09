package com.triffil;

public class E extends Thread{
		public void run(){  
		   System.out.println("running..."); 
		}
	 public static void main(String args[]){  
		  E t1=new E();  
		  E t2=new E();  
		  System.out.println("Name of t1:"+t1.getName());  
		  System.out.println("Name of t2:"+t2.getName());  
		  System.out.println("id of t1:"+t1.getId());  
		  
		  t1.run();  
		  t2.start();  
		  
		  t1.setName("Sonoo Jaiswal");  
		  System.out.println("After changing name of t1:"+t1.getName());  
		 }  
		}  

