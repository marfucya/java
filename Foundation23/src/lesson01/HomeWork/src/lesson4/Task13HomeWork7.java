package lesson4;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task13HomeWork7 {
//	7)Среднее арифметическое
//	Написать класс с методом, возвращающий среднее арифметическое 
//	значение для всех элементов массива
//	Название метода: calcVectorAvg
//	Пример:
//	 calcVectorAvg(int[] vector); // [1234567]
//	14
	
	public static void main (String [] args)
	{
		int [] myArray = {1, 2, 3, 4, 5, 6, 7};
		calcVectorAvg(myArray);
	}
	
	public static int calcVectorAvg (int [] array)
	{
		int sum = Arrays.stream(array).sum();
		int several = sum/array.length;
		System.out.println(several);
		return several;
	}
}
