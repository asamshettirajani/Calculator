package com.onlinecalculator.calculator.calctypes;
import java.util.*;

public class primenum {

	public static void main(String[] args) {
		int i,j,n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
	for(j=1;j<=i;j++)
	{
		if(i%j==0)
	count++;
	}
	if(count==2)
		System.out.println(i);
	count=0;
}

	}

}
