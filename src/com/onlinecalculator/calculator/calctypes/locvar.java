package com.onlinecalculator.calculator.calctypes;
import java.util.*;
public class locvar {
void display(){
	int a;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the value");
	a=s.nextInt();
	System.out.println("local variablex="+a);
}

public static void main(String args[]){
	locvar s=new locvar();
	s.display();
}
}