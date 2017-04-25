package algorithm;
import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 *Created by PIIT_NYA on 04/22/2017.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 */

	public static void main(String[] args) {

		int [] num = new int[10000];
		
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			
		num[i] = rand.nextInt(1000000);
			
		}

		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
        Sort.printSortedArray(num);
		ConnectDB connectDB = new ConnectDB();
		List<String> Value = new ArrayList<String>();
		try {
			connectDB.InsertDataFromArryToMySql(num, "tbl_selectionsort", "column_selectionsort");
			Value = connectDB.readDataBase("tbl_selectionsort", "column_selectionsort");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
		for (String st : Value) {
			System.out.println(st);
		}
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");

		//Insertion Sort
		algo.insertionSort(num);
		Sort.printSortedArray(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

		//Continue for rest of the Sorting Algorithm....
		algo.bubbleSort(num);
		Sort.printSortedArray(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");


	}

}
