package com.reyaz.qa;

class A
{
 public void m1()
 {
	 System.out.println("I am Default Method in Class A");
 }
 public void m2(int a)
 {
	 System.out.println("I am 1 Parameterized Method  in Class A");
 }
}
class B extends A
{
	public void m1()
	 {
		 System.out.println("I am Default Method in class B ");
	 }
	 public void m2(int a)
	 {
		 System.out.println("I am 1 Parameterized Method in class B");
	 }
}
class Test
{
	public static void main(String[] args) 
	{
		//A a = new A();
		//a.m1();
		//a.m2(25);
		//B b = new B();
		//b.m1();
		//b.m2(30);
		
		A a1 = new B();
		a1.m1();
	}
}
