package lesson2;

import java.util.Scanner;

public class Task07IndependenceWork {
	public static void main(String [] args)
	{
		//Ввести переменную с клавиатуры. Если четное, то вывести на экран «четное». Если нет, то вывести на экран «нечетное».
		Scanner scan = new Scanner (System.in);
		System.out.println("Ввведите число:");
		int val1 = scan.nextInt();
		int res = val1 % 2;
		if (res == 1)
		{
			System.out.println("Вы ввели нечетное число");
		}
		
		else 
		{
			System.out.println("Вы ввели четное число");
		}
			
		
	}
}
