package lesson3;

public class Task6 {
  public static void main (String [] args)
  {
	  // Вывести 10 чисел в последовательности, где каждый элемент вдвое больше предыдущего:
	//	1, 2, 4, 8, 16, 32...
		int a = 1;
		for (int i = 0; i<10; i++ )
		{
			System.out.println(a);
			a *= 2;
		}
  }
}
