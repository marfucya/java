package lesson2;

import java.util.Scanner;

public class Task10HomeWork {
//Пользователь вводит три числа, вывести на экран большее и меньшее из них в строчку. 
	public static void main (String [] args)
	{
		Scanner scan1 = new Scanner (System.in);
		System.out.println("Введите число №1");
		int number1 = scan1.nextInt();
		
		Scanner scan2 = new Scanner (System.in);
		System.out.print("Введите число №2");
		int number2 = scan2.nextInt();
		
		Scanner scan3 = new Scanner (System.in);
		System.out.println("Введите число №3");
		int number3 = scan3.nextInt();
		
		int max = Math.max(number1, (Math.max(number2, number3)));
		int min = Math.min(number1, (Math.min(number2, number3)));
		
		System.out.println("Максимальное число " + max);
		System.out.println("Минимальное число " + min);
		
		
	}
}
