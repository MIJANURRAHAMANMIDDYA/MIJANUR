package org.Bridgelabzsolution.funtionalprogram;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		System.out.println("enter the value of x:");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("enter the value of y:");
		int y=sc.nextInt();
		double distance=Math.sqrt(x*x+y*y);
		System.out.println("value of distance is:"+distance);
     }
}
