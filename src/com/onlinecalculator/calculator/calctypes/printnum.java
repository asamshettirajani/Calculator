package com.onlinecalculator.calculator.calctypes;
import java.util.*;

public class printnum {
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter n num");
		int n=s.nextInt();
		do{
			System.out.println(n+"\t");
			n++;
		}
		while(n<+100);
	}

}
