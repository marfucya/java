package lesson2;

import java.util.Scanner;

public class Task09HomeWork {
   public static void main (String [] args)
   {
	   //Пользователь вводит 3 числа, вывести на экран большее из них
	   Scanner scan1 = new Scanner (System.in);
	   System.out.println("Введите число №1");
	   int number1 = scan1.nextInt();
	   
	   Scanner scan2 = new Scanner (System.in);
	   System.out.println("Введите число №2");
	   int number2 = scan2.nextInt();
	   
	   Scanner scan3 = new Scanner (System.in);
	   System.out.println("Введите число №3");
	   int number3 = scan3.nextInt();
	   
	   System.out.println("Максимальное число " + Math.max(number1, (Math.max(number2, number3))));
   }
}
