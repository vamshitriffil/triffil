package com.triffil;

public class C extends Thread{  
	public static void main(String args[]){  
		  C t1=new C();  
		 		  t1.start();
		 		
		 		  System.out.println("running..."); 
	}
	
	 public void run(){  
		 		 try{
			 Thread.sleep(1500);
		 }
		 catch(InterruptedException e){
			 System.out.println("class");
		 }
		 System.out.println("light");
		 
		 
		  
		 
		 
		  
		  	 }  
		}  

