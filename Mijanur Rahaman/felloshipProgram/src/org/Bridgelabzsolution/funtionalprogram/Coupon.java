package org.Bridgelabzsolution.funtionalprogram;

import java.util.Random;
import java.util.Scanner;

public class Coupon {
	
	public static int getcoupon(int n) {
		return (int) (Math.random() * n);
	}

	public static int collect(int n) {
		boolean[] isCollected = new boolean[n];
		int count = 0;
		int distinct = 0;
		while (distinct < n) {
			int value = getcoupon(n);
			count++;
			if (!isCollected[value]) {
				distinct++;
				isCollected[value] = true;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("enter vale of n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = collect(n);
		System.out.println(count);

	}
}