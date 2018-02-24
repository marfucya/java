package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Task11HomeWork {
//	Создать массив из n элементов, заполнив их случайными значениями от 0 до 100. 
//	Найти максимальное значение в массиве.
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Введите количество элементов в массиве");
		int n = scan.nextInt();
		
		int [] array = new int [n];
		for (int i = 0; i < array.length; i++ )
		{
			array [i] = (int)(Math.random()*100);
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		int min = array [0];
		int max = array [0];
		
		for (int i=0; i < array.length; i++)
		{
			if (array[i]>max)
			{
				max = array[i];
			}
			if (array[i]<min)
			{
				min = array [i];
			}
		}
		System.out.println("Max:" + max);
		System.out.println("Min:" + min);
	}
}
