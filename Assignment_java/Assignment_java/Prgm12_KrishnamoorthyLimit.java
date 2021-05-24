package com.anna.cs;

public class Prgm12_KrishnamoorthyLimit {

	static int fact(int f)
	{
		int fact = 1;
		
		if(f == 0)
			return 1;
		else
		{
		
		for (int i=1;i<=f;i++)
			fact=fact*i;
		
		f= fact;
		return f;
		}
	}
	public static void main(String[] args) {
		
		int res= 0;
       
		int lower = 1, upper = 41000;
		
		for (lower =1; lower <= upper; lower++)
		{
		int temp = lower;
		
		int test = lower;
		
		while ( test > 0 )
		{
			int i =  test%10;
			
			res = res + fact(i);

			test = (int) test/10;
			
		}
		
		if (temp == res)
		{
			System.out.println("GIVEN NUMBER " + temp + " IS KRISHNAMURTHY NUMBER");
		}
		else
		{
			//System.out.println("GIVEN NUMBER " + temp + " IS NOT KRISHNAMURTHY NUMBER");
		}
		res=0;
		}
		
	}
	
}
