package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;
class relational{
	int a,b;
	void dynamicInput(){
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		a=s.nextInt();
		System.out.println("enter second number");
		b=s.nextInt();
	}
void display(){
	System.out.println("a==b"+(a==b));
	System.out.println("a!=b"+(a!=b));
	System.out.println("a>b"+(a>b));
System.out.println("a<b"+(a<b));
 System.out.println("a>=b"+(a>=b));
 System.out.println("a<=b"+(a<=b));
 }
}


 public class relationalop{
	
	public static void main(String args[]){
		relational s= new relational();
		s.dynamicInput();
		s.display();
	}

}




