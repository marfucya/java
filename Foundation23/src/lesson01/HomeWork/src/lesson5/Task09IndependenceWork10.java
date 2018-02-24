package lesson5;

public class Task09IndependenceWork10 {
//	Task 10: Написать метод, проверяющий является ли строка полиндромом. 
//	—строка которая одинаково читается справа налево и слева направо.(фииф, нгшшгн)
	
	public static void main (String [] args)
	{
		String str = "hjhjlkjlk";
		myMethod(str);
	}
	
	public static boolean myMethod(String s)
	{
		
	}
}


//public static boolean isPalindrome(String text) {
//    return text.replaceAll("\\W","")
//               .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W",""))
//               .reverse().toString());
//}


//public static boolean isPalindrome(String text) {
//    text = text.replaceAll("\\W","");//удаляем все ненужное
//    StringBuilder strBuilder = new StringBuilder(text);
//    strBuilder.reverse(); //переворачиваем строку
//    String invertedText = strBuilder.toString();//присваиваем перевернутую строку
//
//    return text.equalsIgnoreCase(invertedText) ;//возвращаем сравнение двух строк вне зависимости от регистра
//
//}


//for(i = 0, j = str.length() - 1; i < j; i++, j--) { while (i < j && badchar(str.charAt(i)) i++; while(...) j--; ...