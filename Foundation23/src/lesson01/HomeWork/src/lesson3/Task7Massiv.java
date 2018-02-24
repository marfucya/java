package lesson3;

import java.util.Arrays;

public class Task7Massiv {
	public static void main (String [] args)
	{
		int[] arr = new int [10];
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*100);
		}
		
		for (int j = 0; j < arr.length; j++ )
		{
		 System.out.print(arr[j] + " ");
		}
		
	}
}
