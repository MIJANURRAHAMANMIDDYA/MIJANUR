package org.Bridgelabzsolution.Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Insertionsortstr 
{
	static char[] insertionsort(char arr[],int n)
	{
		int i,j;
		char key;
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
		System.out.println("enter string:");
		String str=sc.nextLine();
		int n=str.length();
		char arr[]=str.toCharArray();
		arr=insertionsort(arr,n);
		System.out.println("afetr sorting:");
		System.out.println(Arrays.toString(arr));

	}

}
