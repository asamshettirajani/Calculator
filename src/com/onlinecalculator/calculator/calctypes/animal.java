package com.onlinecalculator.calculator.calctypes;
import java.util.*;
class animal1 {
String name;
int lifespan;
String shelter;

void input(){
	Scanner s=new Scanner(System.in);
  System.out.println("enter animal name");
	name=s.nextLine();
	Scanner s1=new Scanner(System.in);


	System.out.println("enter animal name");
	
	lifespan=s1.nextInt();
	System.out.println("enter shelter name");
	shelter=s.nextLine();
}
void speak(){
	System.out.println("the"+name+"has life"+lifespan+"years");
	System.out.println("speaking by voice sound");
}
	void move()
	{
		System.out.println("the"+name+"is moving from"+shelter+"to some ");
}
}
	public class animal{
		public static void main(String args[]){
			animal1 a=new animal1();
	a.input();
	a.speak();
	a.move();
}
}