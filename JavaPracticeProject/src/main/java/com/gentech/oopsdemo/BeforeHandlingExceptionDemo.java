package com.gentech.oopsdemo;
class BasicMaths
{
	static void addition(int x,int y)
	{
		int result=(x+y);
		System.out.println("Addition Result :"+result);
	}
	
	static void multiplication(int x,int y)
	{
		int res=(x*y);
		System.out.println("Multiplication Result :"+res);
	}
	
	static void substraction(int x,int y)
	{
		int res=(x-y);
		System.out.println("Substraction Result :"+res);
	}
	
	static void division(int x,int y)
	{
		int res=(x/y);
		System.out.println("Division Result :"+res);
	}
	
	static void modulus(int x,int y)
	{
		int res=(x%y);
		System.out.println("Modulus Result :"+res);
	}
	
	static void averageValue(int x,int y)
	{
		int res=((x+y)/2);
		System.out.println("Average Result :"+res);
	}
	
	static void isEvenNumber(int x)
	{
		if(x%2==0)
		{
			System.out.println(x+" is a Even Number");
		}
	}
	
	static void isOddNumber(int x)
	{
		if(x%2==1)
		{
			System.out.println(x+" is a Odd Number");
		}
	}
	
	static void isPositiveNumber(int x)
	{
		if(x>0)
		{
			System.out.println(x+" is a Postive Number");
		}
	}
	
	static void isNegativeNumber(int x)
	{
		if(x<0)
		{
			System.out.println(x+" is a Negative Number");
		}
	}
}
public class BeforeHandlingExceptionDemo {
	public static void main(String[] args) {
		BasicMaths.addition(20, 50);
		BasicMaths.isPositiveNumber(45);
		BasicMaths.isNegativeNumber(-255);
		BasicMaths.substraction(100, 75);
		BasicMaths.division(450, 0);
		BasicMaths.multiplication(12, 15);
		BasicMaths.isEvenNumber(78);
		BasicMaths.isOddNumber(333);
		BasicMaths.averageValue(40, 50);
		BasicMaths.modulus(37, 2);
	}

}
  