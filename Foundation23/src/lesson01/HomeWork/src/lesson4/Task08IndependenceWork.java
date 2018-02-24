package lesson4;

public class Task08IndependenceWork {
//	Для прямоугольного треугольника.
//	Написать метод, который возвратит сторону гипотенузы,
//	в качестве параметров метод должен принимать 2 переменные с размерами катетов.
	
	public static void main (String [] args)
	{
		int a = 5;
		int b = 7;
		Treygolnic(a,b);
	}
	public static void Treygolnic(int a, int b)
	{
		double c = Math.sqrt((a*a+b*b));
		System.out.println(c);
	}
	
}
