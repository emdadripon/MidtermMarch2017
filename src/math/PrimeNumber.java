package math;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		long startTime = System.currentTimeMillis();
		int numberOfPrimeNumber = 0;
		int[] array  = new int[10];

		for(int i = 2; i<array.length; i++) {
			if (isCheckingByCube(i)) {
				System.out.println(i);
				numberOfPrimeNumber++;
			}
		}
		System.out.println("Total prime number " + numberOfPrimeNumber);
		long endTime = System.currentTimeMillis();
		long totalTime =  endTime - startTime;
		System.out.println(totalTime);
        ConnectDB connectDB = new ConnectDB();

        List<String> primeNumber = new ArrayList<String>();
        try {

            connectDB.InsertDataFromArryToMySql(array, "tbl_PrimeNumber", "column_NumberOfPrime");
            primeNumber = connectDB.readDataBase("tbl_PrimeNumber", "column_NumberOfPrime");

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Data is reading from the Table (tbl_PrimeNumber) and displaying to the console");
        for (String st : primeNumber) {
            System.out.println(st);
        }
	}
	public static boolean isPrime(int n){
		for(int j = 2; j< n; j++){
			if(n % j == 0)
				return false;
		}
		return true;
	}
	private static boolean isCheckingByCube(int n) {
		if(n % 2 == 0) return false;
		for (int i = 3; i * i<= n; i+=2 ){
			if(n%i == 0)
				return false;
		}
		return true;

	}

}
