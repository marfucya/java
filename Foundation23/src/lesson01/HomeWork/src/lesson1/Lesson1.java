package lesson1;

public class Lesson1 {
	public static void main (String [] args) {
		int val1 = 5;
		int val2 = 3;
		int res1 = val1 + val2;
		int res2 = val1 - val2;
		int res3 = val1 * val2;
		int res4 = val1 / val2;
		int res5 = val1 % val2;
		System.out.println("додавання " + res1);
		System.out.println("віднімання " + res2);
		System.out.println("множення " + res3);
		System.out.println("ділення " + res4);
		System.out.println("залишок від ділення " + res5);
		
		double [] val5 = {7.8, -7.8};
		double res6 = 0;
		if (val5.length>0)
		{
			double sum = 0;
			for (int j = 0; j < val5.length; j++) {
				sum +=val5[j];
			}
		res6 = sum/val5.length;
	}
		System.out.println("середне арифмитичне " + res6);

}
}
