package com.triffil;

public class Reverse {

	public static void main(String[] args) {
		
		char ch[]={'J','a','v','A','t','p','o','i','n','t'};
		String s=new String(ch);
		for( int i=0;i<=9;i++){
		
			char k=s.charAt(i);
			
			for(int j=9;j>=0;j--){
				String y=new String(ch); 
			
			char x=y.charAt(j);
			
			System.out.println(x+"=="+k);}
		}		
		
		
		
	}

}
