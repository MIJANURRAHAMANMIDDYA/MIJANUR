package org.Bridgelabzsolution.funtionalprogram;

import java.util.Scanner;

public class Primefactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of N:");
		int N = sc.nextInt();
		for (int i = 2; i < N; i++) 
		{
			while (N % i == 0) 
			{
				System.out.println(i);
				N = N / i;
			}
		}
		if (N > 2)
			System.out.println(N);
	}
}
