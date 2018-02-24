package lesson3;

import java.util.Scanner;

public class Task13HomeWork {
	//вывести массив в консоль и вывести его наоборот. не используя Arrays.toString()
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите размерность массива");
		int n = scan.nextInt();
		
		int [] array = new int [n];
		for (int i=0; i < array.length; i++ )
		{
			array[i] = (int)(Math.random()*100);
			System.out.print(array[i] + " ");
		}
		
		System.out.println("");
		
//		int number;
//		for (int i=0; i<array.length/2;i++)
//		{
//			number = array[i];
//			array[i] = array[array.length-1-i];
//			array[array.length-1-i] = number;
//		}
//		System.out.println(array + " ");
		
	}
}
