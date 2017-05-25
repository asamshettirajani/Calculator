package com.onlinecalculator.calculator.calctypes;
import java.util.*;
class xyz{
void fib(int n,int x,int t){
	int sum;
	if(n==0)
		return;
	sum=x+t;
	System.out.println(x);
	x=t;
	t=sum;
	n--;
	fib(n,x,t);
}
}
public class fibanoci{
	public static void main(String args[]){
		int n=0,x=0,t=1;
		System.out.println("enter the num what u want");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		xyz s1=new xyz();
		System.out.println("fibanocii");
		s1.fib(n,x,t);
	} 
	
}

