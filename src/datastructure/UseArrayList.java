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
		ConnectDB connectDB = new ConnectDB();
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
        List<String> nameList = new ArrayList<String>();
        try {
            connectDB.InsertDataFromArrayListToMySql(list, "tbl_ArrayList", "column_ArrayList");
            nameList = connectDB.readDataBase("tbl_ArrayList", "column_ArrayList");

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Data is reading from the Table (tbl_ArrayList) and displaying to the console");
        for (String st : nameList) {
            System.out.println(st);
        }


	}

}
