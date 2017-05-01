package reader;

import databases.ConnectDB;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		ConnectDB connectDB = new ConnectDB();
		FileReader fr = null;
		BufferedReader br = null;
		String textFile = "/Users/smhoque/Documents/MidtermMarch2017/src/data/self-driving-car";
		//String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

		try {
			fr = new FileReader(textFile);
			br = new BufferedReader(fr);

			String text = " ";
			while ((text = br.readLine()) != null) {
				System.out.println(text);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (fr != null) {
				fr.close();
			}
			if (br != null) {
				br.close();
			}
		} catch (IOException ex) {
			ex.printStackTrace();

		}
	}
}



