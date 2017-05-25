package com.onlinecalculator.calculator.calctypes;
import java.util.*;

public class armstrong {
public static void main(String args[]){
	int temp,n,x,sum=0;
	System.out.println("enter the number");

	Scanner s= new Scanner(System.in);
	n=s.nextInt();
	temp=n;
	while(n>0){
		x=n%10;
		n=n/10;
		sum=sum+(x*x*x);
	}
	if(temp==sum)
		System.out.println("this is an armstrong num");
	else
		System.out.println("this is not an armstrong num");
	
		
}
}
