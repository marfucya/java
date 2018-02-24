package lesson2;
import java.util.Scanner;

public class Task12HomeWork {
	
    public static void main(String[] args) 
    {
    //Пользователь вводит координаты точки, определить в какой она находится четверти (декартова система координат)
   // 	Если точка находится между четвертями, то выводить 0
         
    	     Scanner scan1 = new Scanner (System.in);
         System.out.println("Ввведите координату Х:");
         int coordinateX = scan1.nextInt();
         
         Scanner scan2 = new Scanner (System.in);
         System.out.println("Ввведите координату Y:");
         int coordinateY = scan2.nextInt();
         
         
         if (coordinateX > 0 & coordinateY>0)
         {
        	  System.out.println("Точка находиться в I четверти декартовой системы координат");
         }
         
         else if (coordinateX < 0 & coordinateY>0)
         {
        	  System.out.println("Точка находиться во II четверти декартовой системы координат");
         }
    
         else if (coordinateX < 0 & coordinateY < 0)
         {
        	  System.out.println("Точка находиться в III четверти декартовой системы координат");
         }
         
         else if (coordinateX > 0 & coordinateY < 0)
         {
        	  System.out.println("Точка находиться в IV четверти декартовой системы координат");
         }
         
         else {
        	 System.out.println("Точка находится на оси");
        	 };
         
    }
}    
    	
