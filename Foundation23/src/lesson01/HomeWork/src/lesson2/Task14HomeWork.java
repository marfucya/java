package lesson2;

public class Task14HomeWork {
//	HomeTask 7. Обмен*.
//	Объявить две переменные типа byte и float, вывести на экран (сначала byte, затем float), поменять их значения местами,
//	не используя дополнительной переменной и вывести на экран в том же порядке
//	Пример:
//	20 4.0
//	4 20.0
	
	public static void main (String [] args)
	{
		byte a = 20;
		float b =  (float) 4.8;
		System.out.print((byte)a + " "); System.out.println((float)b);
		
		System.out.print((byte)b + " "); System.out.print((float)a);
		
		
//		System.out.println(b + " " + a);
//		
//		byte tmp = b;
//		b = (byte)a;
//		a = tmp;
//		
//		System.out.println(b + " " + a);
		
	}

}
