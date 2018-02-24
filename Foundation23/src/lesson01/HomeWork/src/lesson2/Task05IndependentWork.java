package lesson2;

import java.util.Scanner;

public class Task05IndependentWork {
	public static void main(String [] args)
	{
		//Task1. ввести значение переменной, определить отрицательное, цифра или число. 

		Scanner scan = new Scanner (System.in);
		System.out.println("Введите значение переменной: ");
		byte val = scan.nextByte();
		if (val <0)
		{
			System.out.println("Вы ввели отрицательное число");
		}
		
		else if (val >=0 & val <10)
		{
			System.out.println("Вы ввели цифру");
		}
		
		else 
		{
			System.out.println("Вы ввели число");	
		}
			
		
	}

}
