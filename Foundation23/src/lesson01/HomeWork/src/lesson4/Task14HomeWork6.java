package lesson4;

public class Task14HomeWork6 {
//	6)Обмен половин
//	Написать класс с методом меняющий местами половины массива, 
//	если размер нечетный - центральный элемент не учитывается
//	Название метода: swapHalves
//	Пример:
//	 swapHalves(int[] vector); // [1234567]
//	[5674123]
	
	public static void main (String [] args)
	{
		int [] myArray = {1, 2, 3, 4, 5, 6, 7};
		swapHalves(myArray);
	}
	
	public static void swapHalves (int [] array)
	{
		int[] tmp1;
		int[] tmp2;
		for (int i=0; i<array.length; i++)
		{

			if (array.length/2==0)
			{
				if (i<array.length/2)
				{
				tmp1[]=array[i];
				}
				else if (i>array.length/2)
				{
				tmp2[]=array[i];
				}
			}
			else 
			{
				if (i<array.length/2-1)
				{
				tmp1[]=array[i];
				}
				else if (i>array.length/2-1)
				{
				tmp2[]=array[i];
				}
				
			}
		System.out.println(tmp1);
		System.out.println(tmp2);
		System.out.print(array[i] + " ");
		
		
		}
	}

}
