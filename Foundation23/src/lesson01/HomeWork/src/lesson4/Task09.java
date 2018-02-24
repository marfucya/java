package lesson4;

import java.util.Arrays;

public class Task09 {
public static void main (String [] args)
{
	int arr[] = {1,2,3,4,5,6};
	foo(arr);
	System.out.println(Arrays.toString(arr));
}

	public static void foo(int [] a)
	{
	a[2] = 52;
	a[4] = 78;
	}
}
