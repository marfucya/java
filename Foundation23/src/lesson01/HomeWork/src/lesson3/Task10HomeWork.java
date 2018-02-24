package lesson3;

import java.util.Scanner;

public class Task10HomeWork {
//	Создать массив из n элементов. С заполнением последовательностью m, m-2, m-4  и так далее. 
//	Вывести массив на экран. С консоли считать n и m.
	
	public static void main (String [] args)
	{
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Ввести размерность массива");
		int n = scan1.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Ввести первый элемент массива");
		int m = scan2.nextInt();
		
		int k = 2;
		
		int[] array = new int [n];
		for (int i = 0; i < array.length; i++ )
		{
			System.out.print(m + " ");
			m-=k;
		}
	}
	
}
