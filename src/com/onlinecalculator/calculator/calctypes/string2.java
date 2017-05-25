package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class string2 {
	public static void main(String args[]){
float a,b;
String name;
Scanner sc=new Scanner(System.in);
System.out.println("welcome to java");
System.out.println("enter first number");
a=sc.nextFloat();
System.out.println("enter second number");
b=sc.nextFloat();
System.out.println("addition:"+(a+b));
System.out.println("subtraction:"+(a-b));
System.out.println("multiplication:"+(a*b));
System.out.println("divison:"+(a/b));

	}
}
