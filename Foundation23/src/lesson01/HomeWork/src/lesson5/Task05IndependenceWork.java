package lesson5;

import java.util.Arrays;

public class Task05IndependenceWork {
//	Task 6(indexOf). Написать метод в качестве параметра должен 
//	принимать 2 строки s и s1.
//	Определить входит ли строка s в строку s1.(Является ли s
//	подстрокой s1).
//	метод должен вернуть значение boolean. (true - если входит)
	
	public static void main (String [] args)
	{
		String first = "dfhjsuwe sfois io33 asifu ";
		String second = "io333";
		//myMethod(first, second);
		System.out.println(myMethod(first, second));
	}
	
	public static boolean myMethod(String s, String s1)
	{
		
	//return	 s.contains(s1);	
	
		
		String[] words = s.split(" ");
		//String[] words2 = s1.split(" ");
		System.out.println(Arrays.toString(words));
		//System.out.println(Arrays.toString(words2));
		
		for (int i=0; i < words.length; i++)
		{
			if(words[i].equals(s1)) return true;
		}
		return false;
		
	}	
}
