package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class instance {
	int x;
	void input(){
	
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value");
		x=s.nextInt();
	
	}
	void display(){
		System.out.println("instance variable:"+x);
	}
	
public static void main(String args[]){
	instance s=new instance();
	s.input();
	s.display();
}
}
