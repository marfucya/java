package lesson2;

import java.util.Scanner;

public class Task11HomeWork {
//Пользователь вводит семизначное число, вывести в консоль среднее арифметическое его цифр
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Введите семизначное число:");
		int number = scan.nextInt();
		System.out.println( number );
		//int res1 = number / 1000000;
		//int res2;
		int count = 0;
		int value = 0;
		double sum = 0;
		double several = 0;
		do 
		{
			value = number % 10;
			number = number/10;
			count ++;
			sum += value;
			System.out.println( sum );
		
		}
		while (count < 7);
		
		several = sum / count;
		
		System.out.println(several);
		
		// 1 234 567
	}
}
