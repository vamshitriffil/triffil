package com.triffil2;

public class B {

	public static void main(String[] args) {
		
		String s1="India";
		String s2="is";
		String s3="my";
		String s4="country";
		System.out.println(s1+" "+s2+" "+s3+" "+s4);
		
		char c[]=s1.toCharArray();
		char t=c[0];
		c[0]=c[s1.length()-1];
		c[s1.length()-1]=t;
		String s5=new String (c);
		
		char c1[]=s2.toCharArray();
		char t1=c1[0];
		c1[0]=c1[s2.length()-1];
		c1[s2.length()-1]=t1;
		String s6=new String (c1);
		
		char c2[]=s3.toCharArray();
		char t2=c2[0];
		c2[0]=c2[s3.length()-1];
		c2[s3.length()-1]=t2;
		String s7=new String (c2);
		
		char c3[]=s4.toCharArray();
		char t3=c3[0];
		c3[0]=c3[s4.length()-1];
		c3[s4.length()-1]=t3;
		String s8=new String (c3);
		
		System.out.println(s5+s5.length()+" "+s6+s6.length()+" "+s7+s7.length()+" "+s8+s8.length());

	}

}
