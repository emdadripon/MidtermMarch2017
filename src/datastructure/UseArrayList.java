package datastructure;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {


	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<String> list = new ArrayList<String>();
		list.add("Steve");
		list.add("Dev");
		list.add("Jet Lee");
		list.add("Monalisa");

		System.out.println(list.add("Jose"));
		System.out.println(list.remove("Monalisa"));
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		ConnectDB connectDB = new ConnectDB();
		List<String> mergeValue = new ArrayList<String>();
		try {

			//connectDB.InsertDataFromArryToMySql(Array, "tbl_mergesort", "column_mergesort");
			mergeValue = connectDB.readDataBase("tbl_mergesort", "column_mergesort");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_mergesort) and displaying to the console");
		for (String st : mergeValue) {
			System.out.println(st);
		}
	}

}
