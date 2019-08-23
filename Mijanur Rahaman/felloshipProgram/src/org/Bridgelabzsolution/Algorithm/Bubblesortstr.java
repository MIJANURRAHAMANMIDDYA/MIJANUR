package org.Bridgelabzsolution.Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Bubblesortstr {

	 static char[] bubblesort(char arr[],int n)
	{
	 for(int i=0;i<n;i++)
	 {  
		 for(int j=0;j<n-i-1;j++)
		 {
			 if(arr[j]>arr[j+1])
			 {
				 char temp=arr[j];
				 arr[j]=arr[j+1];
				 arr[j+1]=temp;
			 }
		 }
	  }
	 return arr;
	 
	}	

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.nextLine();
		int n=str.length();
		char arr[]=str.toCharArray();
		arr=bubblesort(arr,n);
		System.out.println("afetr sorting:");
		System.out.println(Arrays.toString(arr));
	}

}
