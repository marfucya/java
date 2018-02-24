package lesson4;

public class Task04 {
//	создать два метода, один выводит числа от переданного значения до 20 в порядке увеличения, 
//	второй в порядке уменьшения. в метод передаем один аргумент, цифру
//	
	public static void main (String [] args)
	{
		first(6);
		System.out.println();
		second (6);
	}
	public static void first (int a)
	{
		int m = 20-a;
		int [] array = new int [m];
		for (int i=0; i<array.length; i++)
		{
			
			System.out.print(a + " ");
			a = a+1;
		}
	}
	
	public static void second (int b)
	{
		int m = 20-b;
		int [] array = new int [m];
		for (int i=0; i<array.length; i++)
		{
			
			System.out.print(b + " ");
			b = b-1;
		}
	}
	
}
