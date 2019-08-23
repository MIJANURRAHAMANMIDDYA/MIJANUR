package org.Bridgelabzsolution.Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Binarysearchsrt {
	
	static void Binarysearch(char arr[],int low,int high,int n,int data)
	{ 
		int	mid=(low+high)/2;
		while(low<=high)
		{ 
			if(arr[mid]<data)
			{
			low=mid+1;
		   }
		
		else if(arr[mid]==data)
		{
			System.out.println("value is found in: "+mid);
		break;
		}
		
		else
		{
			high=mid-1;
		}
		mid=(low+high)/2;
	    }
		if(low>high)
		{
			System.out.println("element not found");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.nextLine();
		int n=str.length();
		char arr[]=str.toCharArray();
		char arr2[]=arr.clone();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		  System.out.println("enter letter to find:"); 
		  char p=sc.next().charAt(0);
		  Binarysearch(arr,0,n-1,n,p);
		 
	}

}
