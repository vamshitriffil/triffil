package com.triffil;

public class D extends Thread{  
	 public void run(){  
		  for(int i=1;i<=5;i++){  
		   try{  
		    Thread.sleep(100);  
		   }catch(Exception e){System.out.println(e);}  
		  System.out.println(i);  
		  }  
		 }  
		public static void main(String args[]){  
		 D t1=new D();  
		 D t2=new D();  
		 D t3=new D();  
		 t1.start();  
		 try{  
		  t1.join(300);
		  t2.join(500);  
		 }catch(Exception e){System.out.println(e);}  
		  
	 t2.start();  
		 t3.start();  
		 }  
}
