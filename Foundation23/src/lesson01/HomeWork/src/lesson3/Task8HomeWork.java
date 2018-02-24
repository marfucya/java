package lesson3;

import java.util.Scanner;

public class Task8HomeWork {
//Создать массив из n элементов целых чисел. Считать n с консоли. Заполнить случайными значениями от 0 до 100.
//	Во 2-й элемент поместить сумму 2-го и 3-го элемента.  вывести на экран
	
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите количество элементов масиса");
		int n = scan.nextInt();
		
		int [] array = new int [n];
		for (int i = 0; i < array.length; i++)
		{
		array[i] =(int)(Math.random()*100);	
		System.out.print(array[i] + " ");
		}

		System.out.println();
		
		array[1] = array[1] + array[2];

		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
	}
		//System.out.println(array);
		
	}

