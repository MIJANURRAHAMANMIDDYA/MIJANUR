package org.Bridgelabzsolution.Algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagrampalindrome 
{
	static boolean ispalindrome(String k)
	{
		String reversed = "";
		
		for (int i = 0; i < k.length(); i++) 
		{
			reversed=k.charAt(i)+reversed;
		}
		
			return k.equals(reversed);
	
	}

	static boolean isanagram(String s, String c) 
	{
        char arr1[] = s.toCharArray();
		Arrays.sort(arr1);
		char arr2[] = c.toCharArray();
		Arrays.sort(arr2);
		if (s.length() == c.length())
		{
          if(String.valueOf(arr1).equals(String.valueOf(arr2)))
			return true;
         }
		return false;
	}
       static int isprime(int n) 
	  {
		int count = 0;
		for (int j = 1; j <= n; j++) 
		{
			if (n % j == 0)
				count++;
		}
		if (count ==2) 
		{
			return n;
		}
		else 
		{
			return -1;
		}
      }
    
	public static void main(String[] args)
	{
		 int arr[]=new int[1000];
		 int i=0;
		 for(int k=2;k<1000;k++)
		  { 
       	  if((isprime(k)!=-1)&& (ispalindrome(String.valueOf(k))!=false))
       	  {
       	  arr[i]=k;
       	  i++;
       	  }
           }
		 for (int j = 0; j < arr.length; j++)
		 {
			if(arr[j]!=0)
				System.out.print(arr[j]+" ");
		 }
		 for(int p=0;p<arr.length;p++)
		 { 
			 for(int k=1;k<=1000;k++)
			 {
			 if(isanagram(String.valueOf(arr[p]),String.valueOf(k)))
					 System.out.println(arr[p]+"-->"+k);
			 } 
				
		 }
		 
	}
}

	     

	  
	
