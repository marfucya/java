package lesson6;

import java.io.FileWriter;
import java.io.IOException;

public class Task01 {
	public static void main (String [] args) throws IOException
{
		//запись в файл
	FileWriter fw = new FileWriter("text.txt", true); //true - дозаписывает в файл донные; false по умолчанию, перезаписывает данные в файл
	fw.write("stroka 1\n");
	fw.write("stroka 2\n");
	fw.write("\tstroka 3\n");
	fw.write("stroka 4\n");
	fw.write("stroka 5\n");
	
	fw.flush(); // принудительно записывает данные с буфера в файл 
	fw.close(); // закрывает процесс FileWriter, для экономии памяти, потому что FileWriter буферизируется
	
}
}
