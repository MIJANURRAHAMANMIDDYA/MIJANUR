package org.Bridgelabzsolution.Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Insertionsort {
	static int[] insertionsort(int arr[],int n)
	{
		int i,j,key;
		for(i=1;i<n;i++)
		{
			j=i;
			while(j>0 && arr[j-1]>arr[j])
			{
				key=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=key;
				j--;
			}
		}
		return arr;
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of size:");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		
		System.out.println("enter value of array elements:");
		for(int k=0;k<size;k++)
		{
		   arr1[k]=sc.nextInt();	
		}
		arr1=insertionsort(arr1,size);
		
		System.out.println(Arrays.toString(arr1));
	}

}
