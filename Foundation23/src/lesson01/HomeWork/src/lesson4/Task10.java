package lesson4;

import java.util.Arrays;

public class Task10 {
	public static void main (String [] args)
	{
		int arr[] = foo();
		
		System.out.println(Arrays.toString(arr));
	}

		public static int[] foo()
		{
		int [] arr = {1,2,3,4,5};
		return arr;
		}
}
