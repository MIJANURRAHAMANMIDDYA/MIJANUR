package org.Bridgelabzsolution.funtionalprogram;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		int row,col;
		int i,j;
		int array[][]=new int[10][10];
		System.out.println("enter the rows:");
		Scanner sc = new Scanner(System.in);
		 row=sc.nextInt();
		System.out.println("eneter the cols:");
		 col= sc.nextInt();
	
		System.out.println("enter the array element:");
		for ( i = 0; i < row; i++) 
		{
			for ( j = 0; j < col; j++) 
			{
				array[i][j] = sc.nextInt();
			}

		  }
		System.out.println("array is:");
		for ( i = 0; i < row; i++) {
			for ( j = 0; j < col; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}

	}
}
