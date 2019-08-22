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

	static boolean iswin(char arr[][])
	{
		if ((arr[0][0]=='x'&& arr[0][1]=='x' && arr[0][2]=='x')
				   ||(arr[1][0]=='x'&& arr[1][1]=='x' && arr[1][2]=='x')
				   ||(arr[2][0]=='x'&& arr[2][1]=='x' && arr[2][2]=='x')
				   ||(arr[0][0]=='x'&& arr[1][0]=='x' && arr[2][0]=='x')
				   ||(arr[0][1]=='x'&& arr[1][1]=='x' && arr[2][1]=='x')
				   ||(arr[0][2]=='x'&& arr[1][2]=='x' && arr[2][2]=='x')
				   ||(arr[0][0]=='x'&& arr[1][1]=='x' && arr[2][2]=='x')
				   ||(arr[0][2]=='x'&& arr[1][1]=='x' && arr[2][0]=='x'))
		{          
				   System.out.println("player1 win!!!");
				   return true;
		}
		else if ((arr[0][0]=='*'&& arr[0][1]=='*' && arr[0][2]=='*')
				   ||(arr[1][0]=='*'&& arr[1][1]=='*' && arr[1][2]=='*')
				   ||(arr[2][0]=='*'&& arr[2][1]=='*' && arr[2][2]=='*')
				   ||(arr[0][0]=='*'&& arr[1][0]=='*' && arr[2][0]=='*')
				   ||(arr[0][1]=='*'&& arr[1][1]=='*' && arr[2][1]=='*')
				   ||(arr[0][2]=='*'&& arr[1][2]=='*' && arr[2][2]=='*')
				   ||(arr[0][0]=='*'&& arr[1][1]=='*' && arr[2][2]=='*')
				   ||(arr[0][2]=='*'&& arr[1][1]=='*' && arr[2][0]=='*'))
		{
			System.out.println("player2 win!!!");
			return true;
		}
		
		
		return false;
	}
	public static void main(String[] args) 
	{
		
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
		if(row>2||col>2) {
			System.out.println("invalid row and col");}
		arr[row][col]='x';
		display(arr);
		
		if(isfull(arr)==true)
			break;
		
		if(iswin(arr)==true)
			break;
		
		System.out.println("player2 turn");
		System.out.println("eneter row and col:");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		if(r1>2||c1>2) {
		System.out.println("invalid row and col");}
		arr[r1][c1]='*';
	     System.out.println();
		display(arr); 
           if(iswin(arr)==true)
			break;
		}
		 if(isfull(arr)==true)
			 
		    {
			  if(iswin(arr)==false)
			{
			
			System.out.println("match draw");
			
			}
				
		}	
      }
   }
	

		