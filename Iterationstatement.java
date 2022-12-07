package com.pack1;

public class Iterationstatement 
{
void meth1()
{
	System.out.println("-----meth1()-----");
	int i=1;
	while(i<=10)
	{
		System.out.println("i value:"+i++);
		i++;
	}
	System.out.println("meth1() execution complete");
}
void meth2()
{
	System.out.println("-----meth2()----");
	int i=1;
	while(i<=5)
		//int x=100;//C.E we should not write any declarative statements in this line
	System.out.println("i value:"+i++);
	i++;
	System.out.println("meth2() execution complete:"+(++i));
}
void meth3()
{
	System.out.println("-----meth3()-----");
	int i=1;
	while(true)
	{
		System.out.println("i value:"+i++);
	}
	//System.out.println("meth3() execution complete");//C.E bcz unreachable code
}
void meth4()
{
	System.out.println("-----meth4()-----");
	int i=10;
	do
	{
	System.out.println("i value:"+i);
	i++;
	}
	while(i<=5);
		System.out.println("meth4() execution completed"+i);
}
void meth5()
{
	System.out.println("-----meth5()-----");
	int i=1;
	do
	{
		System.out.println("i value:"+i++);
		break;
	}
	while(true);
	System.out.println("meth5()execution complete");
}
void meth6()
{
    System.out.println("-----meth6()-----");	
    int i=1;
    while(true)
    {
    	do
    	{ 
    		System.out.println("i value:"+i++);
    	}
    	while(i<=5);
    	break;
    }
    System.out.println("meth6() execution complete");
}
public static void main(String[] args) 
{
	Iterationstatement aobj=new Iterationstatement();
	aobj.meth1();
	aobj.meth2();
	aobj.meth3();
    aobj.meth4();
	aobj.meth5();
	aobj.meth6();
}
}








