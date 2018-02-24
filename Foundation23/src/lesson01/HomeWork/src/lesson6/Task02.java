package lesson6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Task02 {
public static void main (String [] args) throws FileNotFoundException
{
	//чтение из файла
	FileReader fr = new FileReader("text.txt");
	Scanner scan = new Scanner(fr); 
	
	while(scan.hasNextLine())
	{
		System.out.println(scan.nextLine());	
	}
	scan.close();
}
}
