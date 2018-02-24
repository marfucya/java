package lesson3;

import java.util.Scanner;

public class Task2 {
	public static void main (String [] args)
	{
		Scanner scan1 = new Scanner (System.in);
		System.out.println("Ввести число m");
		int m = scan1.nextInt();
	
		int count1 = 2;
		while (count1 < m)
		{
			System.out.print(count1 +" ");
			count1++;
		}
		
		System.out.println();
		
		Scanner scan2 = new Scanner (System.in);
		System.out.println("Ввести число k");
		int k = scan1.nextInt();
		
		int count2 = 1;
		while (count2 < k)
		{
			System.out.print(count2 + " ");
			count2++;
		}
	}
}
