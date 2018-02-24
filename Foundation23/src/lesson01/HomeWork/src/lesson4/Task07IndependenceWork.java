package lesson4;

public class Task07IndependenceWork {
//	Написать метод(void), который принимает в качестве параметра числа k и n. 
//	Этот метод выводит все четные числа от k до n на экран. 
//	В main считать два числа и передать этому методу.
	public static void main (String [] args)
	{
		int k = 3;
		int n = 15;
		my(k, n);
	
	}
	public static void my(int a, int b)
	{
		for (int i= a; i<b; i++)
			if (i%2==0)
			{ System.out.println(i);} 
	}
}
