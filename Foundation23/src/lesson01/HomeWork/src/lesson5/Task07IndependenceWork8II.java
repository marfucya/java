package lesson5;

public class Task07IndependenceWork8II {
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
		int len = s.length();
		char [] c = new char [len];
		for (int  j= len-1, i = 0; j>=0; j--, i++)
		{
			c[i] = s.charAt(j);
		}
		s = new String(c);
		System.out.println(s);	
	}
}

