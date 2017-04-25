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
        ConnectDB connectDB = new ConnectDB();
		int [] num = new int[100];
		
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			
		num[i] = rand.nextInt(100);
			
		}

		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
        Sort.printSortedArray(num);
		List<String> selectionValue = new ArrayList<String>();
		try {
			connectDB.InsertDataFromArryToMySql(num, "tbl_selectionsort", "column_selectionsort");
			selectionValue = connectDB.readDataBase("tbl_selectionsort", "column_selectionsort");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_selectionsort) and displaying to the console");
		for (String st : selectionValue) {
			System.out.println(st);
		}
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");


		//Insertion Sort
		algo.insertionSort(num);
		Sort.printSortedArray(num);
		List<String> insertionValue = new ArrayList<String>();
		try {
			connectDB.InsertDataFromArryToMySql(num, "tbl_insertionsort", "column_insertionsort");
			insertionValue = connectDB.readDataBase("tbl_insertionsort", "column_insertionsort");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_insertionsort) and displaying to the console");
		for (String st : insertionValue) {
			System.out.println(st);
		}
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in insertion Sort take: " + insertionSortExecutionTime + " milli sec");


        //Bubble sort
		algo.bubbleSort(num);
		Sort.printSortedArray(num);
        List<String> bubbleValue = new ArrayList<String>();
        try {
            connectDB.InsertDataFromArryToMySql(num, "tbl_bubblesort", "column_bubblesort");
            bubbleValue = connectDB.readDataBase("tbl_bubblesort", "column_bubblesort");

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Data is reading from the Table (tbl_bubblesort) and displaying to the console");
        for (String st : bubbleValue) {
            System.out.println(st);
        }
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");


		//Merge sort
        algo.mergeSort(num);
        Sort.printSortedArray(num);
        List<String> mergeValue = new ArrayList<String>();
        try {
            connectDB.InsertDataFromArryToMySql(num, "tbl_mergesort", "column_mergesort");
            mergeValue = connectDB.readDataBase("tbl_mergesort", "column_mergesort");

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Data is reading from the Table (tbl_mergesort) and displaying to the console");
        for (String st : mergeValue) {
            System.out.println(st);
        }
        long mergeSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of "+ num.length + " numbers in merge Sort take: " + mergeSortExecutionTime + " milli sec");


        // Quick sort
		//algo.quickSort(num);
		Sort.printSortedArray(num);
        List<String> quickValue = new ArrayList<String>();
        try {
            connectDB.InsertDataFromArryToMySql(num, "tbl_quicksort", "column_quicksort");
            quickValue = connectDB.readDataBase("tbl_quicksort", "column_quicksort");

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Data is reading from the Table (tbl_quicksort) and displaying to the console");
        for (String st : quickValue) {
            System.out.println(st);
        }
		long quickSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Quick Sort take: " + quickSortExecutionTime  + " milli sec");


		//Heap sort
        algo.heapSort(num);
        Sort.printSortedArray(num);
        List<String> heapValue = new ArrayList<String>();
        try {
            connectDB.InsertDataFromArryToMySql(num, "tbl_heapsort", "column_heapsort");
            heapValue = connectDB.readDataBase("tbl_heapsort", "column_heapsort");

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Data is reading from the Table (tbl_heapsort) and displaying to the console");
        for (String st : heapValue) {
            System.out.println(st);
        }
        long heapSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of "+ num.length + " numbers in heap Sort take: " + heapSortExecutionTime + " milli sec");


        //Bucket sort
        algo.bucketSort(num);
        Sort.printSortedArray(num);
        List<String> bucketValue = new ArrayList<String>();
        try {
            connectDB.InsertDataFromArryToMySql(num, "tbl_bucketsort", "column_bucketsort");
            bucketValue = connectDB.readDataBase("tbl_bucketsort", "column_bucketsort");

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Data is reading from the Table (tbl_bucketsort) and displaying to the console");
        for (String st : bucketValue) {
            System.out.println(st);
        }
        long bucketSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of "+ num.length + " numbers in bucket Sort take: " + bucketSortExecutionTime + " milli sec");


        //Shell sort
        algo.shellSort(num);
        Sort.printSortedArray(num);
        List<String> shellValue = new ArrayList<String>();
        try {
            connectDB.InsertDataFromArryToMySql(num, "tbl_shellsort", "column_shellsort");
            shellValue = connectDB.readDataBase("tbl_shellsort", "column_shellsort");

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Data is reading from the Table (tbl_shellsort) and displaying to the console");
        for (String st : shellValue) {
            System.out.println(st);
        }
        long shellSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of "+ num.length + " numbers in shell Sort take: " + shellSortExecutionTime+ " milli sec");

    }
}
