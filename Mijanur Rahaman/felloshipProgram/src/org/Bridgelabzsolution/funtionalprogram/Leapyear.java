package org.Bridgelabzsolution.funtionalprogram;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter year:"); //accepting input from user
		int year=sc.nextInt();
		if(year<1000 || year>9999)
		{
			System.out.println("not acceptable");
		
		}
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println(year+" year is a leapyear");
				}
				else
					System.out.println(year+" year is a leapyear");
			}
		}
			else
				System.out.println(year+" year is  not  a leapyear");
		}
	
		
	}



