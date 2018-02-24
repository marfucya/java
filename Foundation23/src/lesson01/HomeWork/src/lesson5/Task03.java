package lesson5;

public class Task03 {
	public static void main (String [] args)
	{
	String str = new String("mama mula ramy mulom");
	String str2 = "Foo";
	String str3 = "foo";
	String str4 = new String("foo");
	
	
	System.out.println(str.equals(str2));
	// проверка строк на равенство
	System.out.println(str.length()); // длинна строки
	
	System.out.println(str.charAt(7)); // возвращает чар по индексу
	System.out.println(str.indexOf("m", 6)); //возвращает индекс первого вхождения
	// строки в подстроку
	
	System.out.println(str.lastIndexOf('a')); // возвращает индекс последнего вхождения
	
	System.out.println(str.substring(5, 10)); // вырезает строку из подстроки
	
	System.out.println(str.toUpperCase());
	
	System.out.println(str2.equalsIgnoreCase(str4));
}
}

