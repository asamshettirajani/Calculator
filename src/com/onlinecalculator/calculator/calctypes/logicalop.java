package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
 public class logicalop {
boolean a,b;
void dynamicInput(){
	Scanner s=new Scanner(System.in);
	System.out.println("enter first number");
	a=s.nextBoolean();
	System.out.println("enter second number");
	b=s.nextBoolean();
}
void display(){
System.out.println("a&&b="+(a&&b));
System.out.println("a||b="+(a||b));
System.out.println("a!b="+!(a&&b));

}

public static void main(String args[]){
	logicalop s1= new logicalop();
	s1.dynamicInput();
	s1.display();
}
}