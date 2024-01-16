package com.sprint.forex.entity;


interface abc
{
	void methoda();
}
interface xyz{
	abstract void methodB();
}

public class myclass implements abc,xyz {

	int a;
	myclass(){}
	public void methoda()
	{
		System.out.println("Hello method a");
	
	}
	
	public void methodB()
	{
		System.out.print("Method B");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello interface");
		
		String str=new String("sam").intern();
		String str2=new String("sam").intern();
	System.out.println(str==str2);
	System.out.println(str.equals(str2));
		
		
		myclass obj=new myclass();
		System.out.println(obj.a);
		obj.methoda();
		obj.methodB();

	}

}
