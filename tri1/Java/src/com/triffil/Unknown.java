package com.triffil;

public class Unknown {

	public static void main(String[] args) {
		int n=7;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			for(int k=1;k<=n;k++){
				System.out.print(" * ");
			}
			
		 if(i==j || i+j==n+1){
			System.out.print("*");
		 }
		else{
		
		System.out.print(" ");
	}}
		
		System.out.println();
		

	}
	}
}