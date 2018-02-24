package lesson4;

public class Task06IndependencWork {
//	Написать метод getMax, который принимает два целых числа и возвращает максимальное.
//	В main считать два целых числа, передать методу getMax и вывести результат на экран.
	public static void main (String [] args)
	{
		int a = 5;
		int b = 9;
		int res = getMax(a,b);
		System.out.println(res);
	}
	public static int getMax(int a, int b)
	{
		return Math.max(a, b);
	}
	
}
