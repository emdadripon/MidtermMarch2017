package datastructure;

import databases.ConnectDB;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		ConnectDB connectDB = new ConnectDB();
		List<String> ListOfAccountingBook = new ArrayList<String>();
		ListOfAccountingBook.add("The Wealth Of Nations");
		ListOfAccountingBook.add("Rice Dad Poor Dad");
		ListOfAccountingBook.add("Financial Accounting");
		ListOfAccountingBook.add("Corporate Finance");

		List<String> ListOfEconomicsBook = new ArrayList<String>();
		ListOfEconomicsBook.add("Utilitarianism");
		ListOfEconomicsBook.add("The Economic Consequences of the Peace");
		ListOfEconomicsBook.add("A Contribution to the Critique of Political Economy");
		ListOfEconomicsBook.add("The General Theory of Employment, Interest, and Money ");

		List<String> ListOfProgrammingBook = new ArrayList<String>();
		ListOfProgrammingBook.add("The Art of Computer Programming");
		ListOfProgrammingBook.add("Design Patterns: Elements of Reusable Object-Oriented Software ");
		ListOfProgrammingBook.add("Clean Code: A Handbook of Agile Software Craftsmanship 1st Edition");
		ListOfProgrammingBook.add("52 Programming Problems");

		Map<String, List<String>> ListOfBook = new LinkedHashMap<String, List<String>>();
		ListOfBook.put("Accounting", ListOfAccountingBook);
		ListOfBook.put("Economics", ListOfEconomicsBook);
		ListOfBook.put("Programming", ListOfProgrammingBook);

		for(Map.Entry<String, List<String>> map:ListOfBook.entrySet() ){
			List<String> listOfBook = map.getValue();
			System.out.print(map.getKey());
			for(String book:listOfBook){
				System.out.println(" " + book);
			}
			System.out.println();
		   }

		List<String> nameList = new ArrayList<String>();
		try {
			connectDB.InsertDataFromMapToMySql((List<String>) ListOfBook, "tbl_Map", "column_Map");
			nameList = connectDB.readDataBase("tbl_Map", "column_Map");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_Map) and displaying to the console");
		for (String st : nameList) {
			System.out.println(st);
		}


		}
	}


