package com.anna.cs;

public class Prgm9_Armstrong {

	public static void main(String[] args) 
	{
	int n= 444, originalnumber, remainder, ans= 0;
	originalnumber=n;
	while(originalnumber != 0)
	{
	remainder=originalnumber % 10;
	ans+=Math.pow(remainder, 3);
	originalnumber/=10;
	}
	if(ans==n)
	System.out.println(n + "-It is an Armstrong number");
	else
	System.out.println(n + "-It is not an Armstrong number");
	}
}
