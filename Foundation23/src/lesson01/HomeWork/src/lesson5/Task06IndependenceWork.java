package lesson5;

public class Task06IndependenceWork {
//	Task 7. Написать метод, принимающий в качестве параметра строку. 
//	Возвратить индекс первого вхождения символа "a" этой строки.
	
	public static void main (String [] args)
	{
		String str = "yfrdes fxgfcgh hjo dfdf foiyf artygjk";
		System.out.println(myMethod(str));
		
	}
	
	public static int myMethod (String s)
	{
		
		return s.indexOf("a");
	}
}
