package lesson6;

import java.util.ArrayList;

public class Task05HomeWork5 {
//	Task 6. метод, который вставляет элемент внутрь списка и возвращает его.
//	insertElement(ArrayList<Integer> vector, int index, Integer element) 


	public static void main (String [] args)
	{
		
		ArrayList<Integer> list = new ArrayList<Integer>(5);
	      list.add(15);
	      list.add(20);
	      list.add(25);
	      list.add(22);
	      
		System.out.println(list);
		insertElement(list, 3, 8);
		insertElement(list, 6, 8);
	}
	
	public static void insertElement(ArrayList<Integer> vector, int index, int element)
	{
		if( vector.size() > index ) {
			vector.add(index, element);
		} else {
			System.out.println("no such index");
		}
		System.out.println(vector);
	}
}
