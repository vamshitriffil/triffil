package com.triffil2;

public class A {

	public static void main(String[] args) {
		int x[][]={{1,2,3},{4,5,6},{7,8,9}};
		int i,j,k,t;
		int c [][];
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				System.out.print(x[i][j]);
				System.out.print("  ");
			}
			System.out.println(" ");
		}
		for(i=0;i<1;i++){
			for(j=0;j<3;j++){
				t=x[j][i];
				System.out.print(t);
				System.out.print("  ");
				for(k=1;k<3;k++){
					t=t+x[j][k];
					System.out.print(t);
					System.out.print("  ");
				}
				System.out.println(" ");
			}
		}

	}

}
