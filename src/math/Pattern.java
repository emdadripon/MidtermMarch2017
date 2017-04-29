package math;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		int[] array = new int[100];
         for(int i = 90; i<=array.length; i++) {
          for (int j = i; j<=i; j--) {
          	j--;

			  System.out.print(j + " ");
		  }
		  System.out.print(" ");
         	/*

			 for (int j = i; j >= 1; j--) {
				 System.out.print(j + ",");
				 j--;
			 }

			 System.out.println();
			 ConnectDB connectDB = new ConnectDB();

			 List<String> lowestValue = new ArrayList<String>();
			 try {
				 connectDB.InsertDataFromArryToMySql(array, "tbl_lowestNumber", "column_lowestNumber");
				 lowestValue = connectDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

			 } catch (Exception e) {
				 e.printStackTrace();
			 }
			 System.out.println("Data is reading from the Table (tbl_Patternnumber) and displaying to the console");
			 for (String st : lowestValue) {
				 System.out.println(st);
			 }
			 */
		 }

	}
}
