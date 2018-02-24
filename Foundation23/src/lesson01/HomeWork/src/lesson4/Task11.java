package lesson4;


public class Task11 {
//	Написать класс с методами. 
//	-	Метод заполнения массива случайными числами от 0 до 100. 
//
//	-	Метод вывода на экран - красивый
//		[ 1, 2, 3, 4, 5, 6 ]
//
//	-   Метод вывода части массива, который принимает в качестве параметров: 
//		массив, индекс элемента с которого выводить и индекс элемента по который выводить
//
//
//	-   Метод, который принимает в качестве параметра массив и возвращает его размер. 
//
//	- 	Главный метод (main)
	
	public static void main (String [] args)
	{
		int [] array = new int[10];
		int a = 2;
		int b = 7;
		int [] array2 = {2, 7};
		
		fillArray(array);	
		printArray(array);
		mus(array, a, b);
		System.out.println();
		mus2(array, array2);
		System.out.println();
		size(array);
		
	}
	
	public static void fillArray (int [] a)
	{
		for (int i=0; i< a.length; i++)
		{
			a[i] = (int)(Math.random()*100);	
		}
	}
	
	public static void printArray (int [] array)
	{
		String buff = "[ ";
		for (int i=0; i< array.length; i++)
		{
			if ( array.length - 1 == i ) {
				buff += array[i] + " ]";
			} else {
				buff += array[i] + ", ";
			}
		}
		System.out.println(buff);

	}
	
	public static void mus ( int [] array,int a, int b)
	{
	for (int i = a; i < b; i++)
		{
			System.out.print((array [i] + " "));
		}
	}
	
	public static void mus2 ( int [] array,int [] array2) 
	{
	for (int i = array2[0]; i < array2[1]; i++)
		{
			System.out.print((array [i] + " "));
		}
	}
	
	public static int size (int [] array)
	{
		int myLength = array.length;
		System.out.println(myLength);
		return myLength;
	}
}

