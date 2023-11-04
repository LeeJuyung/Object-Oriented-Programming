package org.object_code.object;

public class Gugudan {

	public static void main(String[] args) {
		System.out.println("60201359 이주영");
		int arr[][]=new int [9][9];
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				arr[i][j]=(i+1)*(j+1);
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}

	}

}
