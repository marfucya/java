package lesson2;

public class Task08 {
	public static void main (String [] args)
	{
		//Дано 2х значное число, вычислить разность между цифрами этого числа.
		int number = 78;
		
		int numeral1 = number  % 10;
		int numeral2 = number / 10;
		int sum = numeral1 + numeral2;
		
		System.out.println(sum);
	}
	
}
