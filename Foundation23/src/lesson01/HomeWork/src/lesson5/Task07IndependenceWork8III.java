package lesson5;

public class Task07IndependenceWork8III {
//	Task 8. Написать метод, принимающий в качестве параметра строку.
//	Возвращающий перевернутую строку.
	public static void main (String [] args)
	{
		String str = "hjdfhop oytfg tdxc";
		//myMethod(str);
		System.out.println(myMethod(str));
	}
	
	public static String myMethod (String s)
	{
		int sLength = s.length();
		char[] sReserved = new char[sLength];
		
		for (int i = 0; i <= sLength/2; i++)
		{
			sReserved[i] = s.charAt(sLength-1-i);
			sReserved[sLength-1-i] = s.charAt(i);
		}
		return new String (sReserved);
	}
}
