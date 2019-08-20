package org.Bridgelabzsolution.funtionalprogram;

import java.io.RandomAccessFile;
import java.util.Random;
import java.util.Scanner;

public class Coins {

	private static Object next;

	public static void main(String[] args)
	
   {
		double tail=0,head=0;
			double	hvstper;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number to flip:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			Random R=new Random();
			Float value=R.nextFloat();
			if(value<0.5)
				tail++;
			else
				head++;
		}
		hvstper=(head/tail)*100;
		System.out.println("number of heads:"+head);
		System.out.println("number of tails:"+tail);
		
		System.out.println("percentages of head vs tail:"+hvstper+"%");
		}
}
