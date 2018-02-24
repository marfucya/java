package lesson2;

public class Task03 {
	public static void main (String[] args)
	{

int age = 157;
		System.out.println("START");
		
		if (age < 18){
			System.out.println("IF");
		}  else if (age < 60){
			System.out.println("ELSE IF 1");
		} else if (age < 90){
			System.out.println("ELSE IF 2");
		} else {
			System.out.println("ELSE");
		}
	
		System.out.println("END");
	}
}
