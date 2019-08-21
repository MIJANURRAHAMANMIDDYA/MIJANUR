package org.Bridgelabzsolution.funtionalprogram;

import java.util.Scanner;

public class Windchill {

	public static void main(String[] args) {
		double v,t,w;
		System.out.println("enter the value of v and t:");
		Scanner sc=new Scanner(System.in);
		v=sc.nextDouble();
		t=sc.nextDouble();
		if(v>120||v<3)
		{
			System.out.println("invalid speed");
		}
		if(t>50)
		{
			System.out.println("invalid temperature");
		}
		else {
			w=35.74+0.6215*t+(0.4275*t*Math.pow(v, 0.16))-(35.75*Math.pow(v, 0.16));
			System.out.println("value of w is:"+w);
		}
	}

}
