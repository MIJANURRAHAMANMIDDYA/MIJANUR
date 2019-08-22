package org.Bridgelabzsolution.Algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagrampalindrome 
{
	static boolean ispalindrome(int n) 
	{
		int  sum = 0, digit;
		int temp=n;
		while (temp > 0) 
		{
			digit = temp % 10;
			sum = sum * 10 + digit;
			temp = temp/ 10;
		}
		if (n == sum)
			return true;
		else
			return false;
        }

	static boolean isanagram(int n1, int n2)
	{
		
		String s = Integer.toString(n1);
		char arr1[] = s.toCharArray();
		Arrays.sort(arr1);
		String c = Integer.toString(n2);
		char arr2[] = c.toCharArray();
		Arrays.sort(arr2);
		if (s.length() == c.length())
		{

			for (int i = 0; i < s.length(); i++) 
			{
				if (arr1[i] == arr2[i])
		       return true;
		     else 
	            return false;
		  }
	   }
	   return false;
	   
   }
	public static void main(String[] args)
	{
		 ArrayList arr=new ArrayList(); 
		 int term=0;
		for(int i=2;i<=1000;i++)
    	{
    		int count=0;
    		
    		for(int j=1;j<=i;j++)
    		{
    			if(i%j==0)
    				count++;
    		}
    		if (count<=2)
    		  {
    			term++;
    		    System.out.println(i);
    		    arr.add(i);
	           System.out.println(arr); 
    		  }
    	}
		 ArrayList arr1=new ArrayList();
		
		  for(int k=0;k<term;k++)
		  {
		  
		  if(ispalindrome((int)arr.get(k)))
			System.out.println(arr.get(k));
		      arr1.add(arr.get(k));
		   System.out.println(arr1);
    	  }
		}
}
	