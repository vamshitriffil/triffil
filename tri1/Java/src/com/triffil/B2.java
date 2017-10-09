package com.triffil;
import java.util.*;
 class Student implements Comparable<Student>{  
    int rollno;  
    String name;  
    int age;  
    Student(int rollno,String name,int age){  
    this.rollno=rollno;  
    this.name=name;  
    this.age=age;  
}   
  public int compareTo(Student st){  
    if(age==st.age)  
    return 0; 
    else if(age>st.age)  
    return 1;  
    else  
    return -1;      }
public char[] getName() {
	
	return null;
}}  
    public class B2{  
	public static void main(String args[]){ 
	List<Student> al=new ArrayList<Student>();  
	al.add(new Student(101,"Vijay",23));  
	al.add(new Student(106,"Ajay",27));  
	al.add(new Student(105,"Jai",20));  
	Iterator<Student> itr=al.iterator();  
  while(itr.hasNext()){   System.out.println(itr.next());  }  } }