package lesson2;

import java.util.Scanner;

public class Task13HomeWork {
//Пользователь вводит год, определить является ли он високосным
//	(год является високосным в двух случаях: либо он кратен 4, но при этом не кратен 100, либо кратен 400)
	
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Введите год");
		int year = scan.nextInt();
		int delNa4 = year % 4;
		int delNa100 = year % 100;
		int delNa400 = year % 400;
		
		if (delNa4 == 0 && delNa100 != 0 | delNa400 == 0 )
		{
			System.out.println("Год высокосный");
		}
		
		else 
		{
			System.out.println("Год не высокосный");
		}
		
		
	}
	
}
