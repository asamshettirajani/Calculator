package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class localvar {
	 static void display(){
		int x;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value");
		x=s.nextInt();
		System.out.println("local variablex="+x);
	}
	
public static void main(String args[]){
	display();
}
}