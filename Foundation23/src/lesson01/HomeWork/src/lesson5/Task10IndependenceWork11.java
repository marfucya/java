package lesson5;

public class Task10IndependenceWork11 {
//	Task 11: Написать метод, который принимает строку и возвращает
//	массив целых чисел с индексами, где встречаются символы 'а'.
	
	public static void main (String [] args)
	{
		String str = "sdjh jshdjg asdjhj asiduue";
		myMethod(str);
		//System.out.println(myMethod(str));
	}
	
	public static void myMethod(String s)
	{
		int [] array = null;
		for (int i=0; i<s.length(); i++)
		{
			if (s.indexOf('a') <0)
			{
				System.out.println(array[i] = i);	
			}
		}
		//return array;
		
	}
}


