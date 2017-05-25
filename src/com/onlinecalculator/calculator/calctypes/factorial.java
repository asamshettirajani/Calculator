package com.onlinecalculator.calculator.calctypes;
import java.util.*;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		n=sc.nextInt();
		for(i=n;i>=1;i--)
		{
			fact=fact*i;
		}
System.out.println("factorial:"+fact);
	}
}

