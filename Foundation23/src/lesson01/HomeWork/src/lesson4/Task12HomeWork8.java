package lesson4;

public class Task12HomeWork8 {
//	8)Сумма нечетных
//	Написать метод возвращающий количество нечетных элементов массива
//	Название метода: calcNonPairCount
//	Пример:
//	 calcNonPairCount(int[] vector); // [1234567]
//	4
	public static void main (String [] args)
	{
		int [] myArray = {1, 2, 3, 4, 5, 6, 7};
		
		calcNonPairCount(myArray);	
	}
	
	public static int calcNonPairCount (int [] array)
	{
		int count = 0;
		for (int i=0; i < array.length; i++)
		{
			if (array[i]%2==1)
			{
				count++;
			}
		}
		System.out.println(count);
		return count;
	}
	
}
