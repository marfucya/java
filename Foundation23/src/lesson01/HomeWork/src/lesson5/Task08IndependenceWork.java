package lesson5;

public class Task08IndependenceWork {
	//Task 9: Написать метод, возвращающий вторую половину строки.
	public static void main (String [] args)
	{
	String str = "i love you";
	System.out.println(myMethod(str));
	}
	
	public static String myMethod(String s)
	{
		return s.substring(s.length()/2, s.length());
	}
}
