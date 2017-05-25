package com.onlinecalculator.calculator.calctypes;
import java.util.*;

public class incdec {
	int a;

		void dynamicInput(){
			Scanner s=new Scanner(System.in);
			System.out.println("enter first number");
			a=s.nextInt();
		}
			
		
	void display(){
		System.out.println("preinc"+(++a));
		System.out.println("predec"+(--a));
	System.out.println("postinc"+(a++));
	 System.out.println("postdec"+(a--));

	 }
	}


	  class increment{
		
		public static void main(String args[]){
			incdec s= new incdec();
			s.dynamicInput();
			s.display();
		}
	 
	}


