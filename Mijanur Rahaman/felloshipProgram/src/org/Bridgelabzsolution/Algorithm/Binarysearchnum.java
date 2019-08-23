package org.Bridgelabzsolution.Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Binarysearchnum 
{
 static void Binarysearch(int arr[],int low,int high,int n,int data)
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
		System.out.println("enter value of size:");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		
		System.out.println("enter value of array elements:");
		for(int k=0;k<size;k++)
		{
		   arr1[k]=sc.nextInt();	
		}
		
		
		  System.out.println("enter value for serching:"); 
		  int data1=sc.nextInt();
		 
		
		  for(int j=0;j<arr1.length;j++)
		  {
			for(int k=0;k<arr1.length;k++)
			{ 
				if(arr1[k]>arr1[j])
				{
					int temp=arr1[k];
					arr1[k]=arr1[j];
					arr1[j]=temp;
				}
			}
		  }
		 System.out.println(Arrays.toString(arr1));
		 
		 Binarysearch( arr1,0,size-1, size,data1); 
	}

}
