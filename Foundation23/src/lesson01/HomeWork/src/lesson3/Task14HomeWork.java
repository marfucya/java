package lesson3;

public class Task14HomeWork {
//	Создать массив из n элементов. Заполнить массив числами: посередине 0, 
//	затем вправо и влево увеличиваем на 1. 
//	Если количество элементов четное, то внутри должно быть 2 нуля.
//	Вывести массив на экран. Пример: 5,4,3,2,1,0,1,2,3,4,5
	public static void main (String [] args) 
	{
		int [] array = new int [9];
		for (int i=0; i< array.length; i++);
		{
			if (i<array.length/2)
			{
				array[i] = i-1;
				System.out.println(array[i]);
			}
			
		}
	}

}
