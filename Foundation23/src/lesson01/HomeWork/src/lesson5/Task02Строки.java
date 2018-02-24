package lesson5;

import java.util.Scanner;

public class Task02Строки {
	public static void main (String [] args)
	{
		String str = new String ("stroka01");
		System.out.println(str);
		
		String str2 = "stroka02";
		System.out.println(str2);
		

		char ch = 'A';
		char ch2 = 65;
		char [] arr = {ch, 'r', 'r', ch2, 'y'};
		String str3 = new String (arr);
		System.out.println(str3);
		
		
		Scanner scan = new Scanner (System.in);
		String str4 = scan.next();
		System.out.println(str4);
	}
}
