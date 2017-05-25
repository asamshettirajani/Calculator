package com.onlinecalculator.calculator.calctypes;
import java.util.*;

public class palindrome {

	public static void main(String args[]){
		int n,x,sum=0,temp;
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		temp=n;
		while(n>0){
			x=n%10;
			n=n/10;;
			sum=(sum=x)*10;
			
		}
		sum=sum/10;
		if(temp==sum)
			System.out.println("this is palindrome");
		else 
			System.out.println ("this is not a palindrome");
	}

}
