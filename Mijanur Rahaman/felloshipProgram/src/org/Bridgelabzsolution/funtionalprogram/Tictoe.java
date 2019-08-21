package org.Bridgelabzsolution.funtionalprogram;

import java.util.Random;
import java.util.Scanner;

public class Tictoe { 
	
	static void display(char arr1[][])
     {
		for (int i1 = 0; i1 < arr1.length; i1++) 
		 {
			for (int j1 = 0; j1 < arr1.length; j1++) 
			{
				System.out.print(arr1[i1][j1]);
			}
			System.out.println();
		}
     }
	static boolean isfull(char arr1[][])
    {
		for (int i1 = 0; i1 < arr1.length; i1++) 
		 {
			for (int j1 = 0; j1 < arr1.length; j1++) 
			{
				if(arr1[i1][j1]=='0')
					return false;
				}
		 }
		return true;
    }

	
	public static void main(String[] args) {
		
		char arr[][]= {{'0','0','0'},{'0','0','0'},{'0','0','0'}};		
		System.out.println("array elements are:");
        display(arr);
        
		Scanner sc=new Scanner(System.in);
		while(true) 
		{
		System.out.println("player1 turn");
		System.out.println("enter row and col:");
		int row=sc.nextInt();
		int col=sc.nextInt();
		arr[row][col]='x';
		display(arr);
		if(isfull(arr)==true)
			break;
		
		System.out.println("player2 turn");
		System.out.println("eneter row and col:");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		arr[r1][c1]='*';
		display(arr);
		 if(isfull(arr)==true)
				break;
		System.out.println(isfull(arr));

		}
		System.out.println();
		display(arr);
}
}
		