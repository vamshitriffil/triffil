package com.triffil;

import java.util.*;

public class A1 {  
	 public static void main(String args[]){  
		  Map<Integer,String> map=new TreeMap<Integer,String>();  
		  map.put(10,"Am");  
		  map.put(101,"Vijay");  
		  map.put(100,"Rahul"); 
		  map.put(104,"Amit");
		  for(Map.Entry<Integer, String> m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }  
		}