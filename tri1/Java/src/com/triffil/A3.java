package com.triffil;

import java.util.Hashtable;
import java.util.Map.Entry;

public class A3 {
	public static void main(String args[]){  
		  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(100,"amit");  
		  hm.put(100,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"amit");  
		  
		  for(Entry<Integer, String> m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
}
}