package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;
import java.lang.Math;
public class StatisticCalc extends BasicCalc{
	int a,b,ch,i;
	double no_array[];
	public int menu()
	{
		System.out.println("select option");
		System.out.println("1.addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.divison");
		System.out.println("5.mean\n");
		System.out.println("6.median\n");
		System.out.println("7.mode\n");
		System.out.println("8.exit\n\n");
		System.out.println("enter your choice");
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		return ch;
		}	
	

    public void userInputs()
    {
    	Scanner s=new Scanner(System.in);   
    	if(ch>=5 && ch<=8){
    		System.out.println("enter total number of values");
    		int len=s.nextInt();
    		no_array=new double[len];
    		System.out.println("Enter "+ len + "Elements");
    		
    		for(int i=0;i<no_array.length;i++)
    		no_array[i]=s.nextInt();
    	}
    else
    {
    	System.out.println("enter first number");
    	a=s.nextInt();
    	System.out.println("enter second number");
    	b=s.nextInt();
    }
    }
    public void performOperation(){    	
    		switch(ch)
      		{
      		case 1:
      		
      		case 2:
      			
      		case 3:
      			
      		case 4:
      			super.performOperation();
      			break;
      		case 5:
      			System.out.println(mean());
      			break;
    		case 6:
      			System.out.println(median());
      			break;
    		case 7:
      			System.out.println(mode());
      			break;
    		case 8:
    			System.out.println("bye");
    			System.exit(0);
    			break;
    	
      			default:System.out.println("wrong choice");
    		break;
    		 
    		    		
    		}
       
    }
    double mean(){
    	double sum=0;
    	for(int i=0;i<no_array.length;i++)
    	{
    		sum+=no_array[i];
    	}
    		double meanValue=sum/no_array.length;
    		return(meanValue);
    }
		
    
	double median()
	{
		int middle=no_array.length/2;
		if(no_array.length%2==1){
			double meanvalue=no_array[middle];
			return(meanvalue);
		}
		else{
			double meanvalue=(no_array[middle-1]+no_array[middle]/2.0);
			return(meanvalue);
		}
		}
	double mode ()
	{
		double modevalue=no_array[0];
		int maxCount=0;
		for(int i=0;i<no_array.length;i++){
			double value=no_array[i];
			int count=1;
			for(int j=0;j<no_array.length;j++){
				if(no_array[j]==value)
					count++;
				if(count>maxCount){
					modevalue=value;
					maxCount=count;
				}
			}
		}
		return(modevalue);
	}
}