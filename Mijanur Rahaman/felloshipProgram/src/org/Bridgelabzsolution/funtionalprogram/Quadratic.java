package org.Bridgelabzsolution.funtionalprogram;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		double a,b,c;
		double root1,root2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a,b,c:");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		double delta=b*b-4*a*c;
		if(delta>0)
		{
			root1=(-b+Math.sqrt(delta))/(2*a);
			root2=(-b-Math.sqrt(delta))/(2*a);
		
		System.out.println("value of roots are:"+root1+root2);
		}
		if(delta==0)
		{
			root1=root2=-b/(2*a);
			System.out.println("value of roots is:"+root1);
		}
		if(delta<0)
		{
			double real=-b/(2*a);
			double imag=Math.sqrt(-delta);
			System.out.format("root1= %.21f+%.21fi,root2=5.21f-%.21fi",real,imag,real,imag);
		}
	}

}
