package lesson3;

import java.util.Scanner;

public class Task12HomeWork {
//	Создать массив целых (размер c консоли), заполнить любыми значениями от 0 до 100, 
//	Вывести на экран первую половину массива.
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ввести размерност массива");
		int n = scan.nextInt();
		
		int [] array = new int [n];
		for (int i=0; i<array.length; i++)
		{
			array[i] = (int)(Math.random()*100);
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		for (int i=0; i<array.length/2; i++)
		{
			System.out.print(array[i] + " ");
		}
		
	}
	
}
