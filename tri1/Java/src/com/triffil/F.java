package com.triffil;

public class F extends Thread{  
		 public void run(){  
		   System.out.println("running thread name is:"+Thread.currentThread().getName());  
		   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
		  
		  }  
		 public static void main(String args[]){  
		  F m1=new F();  
		  F m2=new F();  
		  m1.setPriority(Thread.MAX_PRIORITY);  
		  m2.setPriority(Thread.NORM_PRIORITY);  
		  m1.start();  
		  m2.start();  
		   
		 }  
		}     

