package com.triffil;

public class C1{  
	C1(){
	 System.out.println("hello a");}  
	C1(int x){ 
		 
		this();  
		System.out.println(x);  
	
	}  
	
	}  
	class TestThis5{  
	public static void main(String args[]){  
	new C1(9);  
	
		}
}
