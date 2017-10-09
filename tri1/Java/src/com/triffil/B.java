package com.triffil;

public class B implements Runnable{  
	 public void run(){  
		  for(int i=1;i<5;i++)
		  {  
		    try
		    {
		    	Thread.sleep(1000);
		    }
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    }  
		    System.out.println(i);  
		  }  
		 }  
		 public static void main(String args[]){  
		  B t1=new B();  
		B t2=new B();
		Thread t=new Thread(t1);
		Thread t3=new Thread(t2);
		t.start();
		t3.start();
		   
		//  t1.run();  
		  //t2.run();  
		  
		 }  
		}  
