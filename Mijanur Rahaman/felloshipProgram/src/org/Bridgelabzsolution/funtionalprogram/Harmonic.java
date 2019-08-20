package org.Bridgelabzsolution.funtionalprogram;

import java.util.Scanner;

public class Harmonic
{

	public static void main(String[] args) {
		double sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int N = sc.nextInt();
		double value = Math.pow(N, -1);
		System.out.println("the value is:" + value);
		for(int i=1;i<=N;i++)
		{
			sum=sum+Math.pow(i, -1);
		}
			System.out.println("the sum is:"+sum);

	}

}
