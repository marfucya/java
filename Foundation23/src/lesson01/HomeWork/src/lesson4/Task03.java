package lesson4;

public class Task03 {
	public static void main (String [] args)
	{
		int val = 4;
		sum(val, 3);
		sum(val, 5, 1);
		
	}
	
	public static void sum (int a, int b)
		{
		System.out.println(a+b);
		}
	
	public static void sum (int a, int b, int c)
	{
	System.out.println(a+b+c);
	}
	
	}

