package org.Bridgelabzsolution.Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort {

	 static int[] bubblesort(int arr[],int n)
	{
	 for(int i=0;i<n;i++)
	 {  
		 for(int j=0;j<n-i-1;j++)
		 {
			 if(arr[j]>arr[j+1])
			 {
				 int temp=arr[j];
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
		System.out.println("enter value of size:");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		
		System.out.println("enter value of array elements:");
		for(int k=0;k<size;k++)
		{
		   arr1[k]=sc.nextInt();	
		}
		arr1=bubblesort(arr1,size);
		
		System.out.println(Arrays.toString(arr1));
	}
}
