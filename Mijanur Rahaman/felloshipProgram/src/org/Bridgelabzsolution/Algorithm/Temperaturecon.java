package org.Bridgelabzsolution.Algorithm;

import java.util.Scanner;

public class Temperaturecon {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of celsius:");
		int c=sc.nextInt();
		int F=(c*9/5)+32;
		System.out.println("value of fahrenheit:"+F);
		System.out.println("enter value of fahrenheit:");
		int F1=sc.nextInt();
		int C1=(F1-32)*5/9;
		System.out.println("value of celcius:"+C1);
		
	}
     
}
