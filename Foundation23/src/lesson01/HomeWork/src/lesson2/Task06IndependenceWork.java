package lesson2;

import java.util.Scanner;

public class Task06IndependenceWork {
	public static void main(String [] args)
	{
		//Task2. ввести переменную 1, переменную 2 с клавиатуры. вывести на экран наибольшее.
		Scanner scan = new Scanner (System.in);
		System.out.println("Введите первую переменную: ");
		byte val1 = scan.nextByte();
		System.out.println("Введите вторую переменную: ");
		byte val2 = scan.nextByte();
		
		if (val1 > val2)
		{
			System.out.println("Наибольшее число " + val1 );
		}
		
		else 
		{
			System.out.println("Наибольшее число " + val2 );
		}
		
	}
}
