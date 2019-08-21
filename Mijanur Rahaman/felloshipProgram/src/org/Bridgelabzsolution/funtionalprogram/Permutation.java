package org.Bridgelabzsolution.funtionalprogram;

import java.util.Scanner;

public class Permutation {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string:");
		String s = sc.next();
		int n = s.length();
		Permutation permutation = new Permutation();
		permutation.permute(s, 0, n - 1);
	}

private String permute(String s, int l, int r) 
{ 
    if (l == r) 
        System.out.println(s); 
    else
    { 
        for (int i = l; i <= r; i++) 
        { 
            s = swap(s,l,i); 
            permute(s, l+1, r); 
            s = swap(s,l,i); 
        }
    }
	return s;
}
	String swap(String a, int i, int j) 
	{
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}

