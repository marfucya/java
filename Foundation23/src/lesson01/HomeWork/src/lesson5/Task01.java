package lesson5;

import java.util.Arrays;

public class Task01 {
	public static void main (String[] args)
	{
		char ch = 'A';
		char ch2 = 65;
		int i = ch+5;
		System.out.println(i);
		
		char [] arr = {ch, 'r', 'r', ch2, 'y'};
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		
		ch = (char)i;
	}
}
