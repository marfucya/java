package lesson6;

import java.util.ArrayList;

public class Task04HomeWork4 {
//	Task 4. Написать метод заполнения списка случайными целыми числами от 0 до 100.
//	метод принимает список и кол-во элементов.
//	Task 5. метод, который выводит список на экран. 
//	Формат вывода:
//	[0] = 10
//	[1] = 20
//	[2] = 30
	
	public static void main (String [] args)
	{
		ArrayList<Integer> states = new ArrayList<Integer>();
		myMethod(states, 10);
		
		
	}
	
	public static void myMethod (ArrayList<Integer> list,int b)
	{
		for (int i = 0; i < b; i++)
		{
			list.add( (int)(Math.random()*100) );
			System.out.println( "["+i+"]="+list.get(i) );
		}
		System.out.println( list );
		
	}
	
}
