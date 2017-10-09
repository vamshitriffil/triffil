package com.triffil;


public class Test {
		void m(){System.out.println("hello m");}  
		void n()
		{  
		System.out.println("hello n");  

		this.m();  
		}  
		public static void main(String args[]){  
		Test a=new Test();  
		a.n();  
		}

}
