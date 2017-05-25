package com.onlinecalculator.calculator.calctypes;
import java.util.*;
public class staticvar {
static int a;
static void display(){
	Scanner s=new Scanner(System.in);
	System.out.println("enter the value");
	a=s.nextInt();
	System.out.println("local variablex="+a);
}

public static void main(String args[]){
	display();
}
}

