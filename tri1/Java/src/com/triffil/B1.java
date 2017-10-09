package com.triffil;

import java.util.*;
import java.util.Map.Entry;


public class B1 {
			   public enum Days {  
		   Monday, Tuesday, Wednesday, Thursday  
		   };  
		   public static void main(String[] args) {  
		   //create and populate enum map  
		   EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);  
		   map.put(Days.Monday, "1");  
		   map.put(Days.Tuesday, "2");  
		   map.put(Days.Wednesday, "3");  
		   map.put(Days.Thursday, "4");  
		   // print the map  
		   for(Entry<Days, String> m:map.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }   
}
}
