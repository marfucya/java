package lesson5;

public class Task07IndependenceWork8I {
//	Task 8. Написать метод, принимающий в качестве параметра строку.
//	Возвращающий перевернутую строку.
	
	private static final char String = 0;

	public static void main (String [] args)
	{
		String str = "hjdfhop oytfg tdxc";
		myMethod(str);
		//System.out.println(myMethod(str));
	}
	
	public static void myMethod (String s)
	{
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
	}
}
