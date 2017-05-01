package datastructure;

import databases.ConnectDB;

import java.util.*;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		ConnectDB connectDB = new ConnectDB();
		LinkedList<String> list = new LinkedList<String>();
		System.out.println("Please enter numeric number size of list");

		Scanner sc = new Scanner(System.in);
		int NumberOfInput = sc.nextInt();

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter elements of list");
		for(int i = 0; i<NumberOfInput; i++){
			String name  = input.nextLine();
			list.add(name);
		}
		System.out.println("Retriving elements from LinkedList");
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		try{
			if(sc!=null){
				sc.close();
			}
			if(input!=null){
				sc.close();
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		System.out.println("Retriving elements by enhance for loop");
		for(String course:list){
			System.out.println(course);
		}
		List<String> nameList = new ArrayList<String>();
		try {
			connectDB.InsertDataFromArrayListToMySql(list, "tbl_LinkedList", "column_LinkedList");
			nameList = connectDB.readDataBase("tbl_LinkedList", "column_LinkedList");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_selectionsort) and displaying to the console");
		for (String st : nameList) {
			System.out.println(st);
		}
	}
}
