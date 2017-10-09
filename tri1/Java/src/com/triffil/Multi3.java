package com.triffil;

public class Multi3 extends Thread{  
	public void run(){  
		System.out.println("thread is running");  
		}  
		  
		public static void main(String args[]){  
		Multi3 t1=new Multi3();    
		t1.start(); 
		t1.run();
		 
		}
}
