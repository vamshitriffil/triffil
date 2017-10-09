package com.triffil;

public class Encapsulation {
  
		private String name;  
		   
		public String getName(){  
		return name;  
		}  
		public void setName(String name){  
		this.name=name ;
		}  
		}  
		
		class T{  
		public static void main(String[] args){  
		Encapsulation s=new Encapsulation();  
		s.setName("vijay");  
		System.out.println(s.getName()); 
		}  

	
}
