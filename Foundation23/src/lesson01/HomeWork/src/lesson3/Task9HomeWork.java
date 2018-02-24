package lesson3;
import java.util.Arrays;

import java.util.Scanner;

public class Task9HomeWork {
//Создать массив из n элементов целых чисел. Заполнить случайными значениями от 0 до 100.
//	Поменять местами первый и последний элемент.
	
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
		
//		
	
	    int first = array[0];
	    array[0] = array[array.length-1];
	    array[array.length-1] = first;
	    
	    String newarray = Arrays.toString(array);
	    System.out.println(newarray);
	    
//	    int last = array[array.length-1];
//	    
//	    for (int i=0; i < array.length; i++ )
//	    {
//	    	if (i>= 1 & i < (array.length-1)) 
//	    			{
//	    	System.out.print( array[i]+ " ");
//	    }
	    
//	    int[] arraycopy = array.clone();
////		array[0] = arraycopy[arraycopy.length-1];
////		System.out.println(arraycopy[n]);
		
//	    	
//	    	
//		
//	    }	
	}
}
