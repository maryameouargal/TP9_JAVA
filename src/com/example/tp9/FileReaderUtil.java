package com.example.tp9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderUtil {

//	STEP 6 
	public void readFile(String filePath) throws IOException {
		// to open the file
		BufferedReader reader = new BufferedReader(new FileReader(filePath));

		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println("the context of the file : " + line);
		}

		// to close the file
		reader.close();
	}

//    STEP 7 
	public void readFileSafely(String filePath) {
		// We insiale at null
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader(filePath));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println("Ligne : " + line);
			}
		} catch (IOException e) {
			System.out.println("Oopsie it's impossible to read the file  : " + e.getMessage());
		} finally {
			// alawys executed
			try {
				if (reader != null) {
					reader.close();
					System.out.println("( the file is really closed )");
				}
			} catch (IOException ex) {
				System.out.println("error in the step of clossing : " + ex.getMessage());
			}
		}
	}

//    STEP 8 
	public void readFileModern(String filePath) {
		// we can't get without using close
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println("Ligne moderne : " + line);
			}
			System.out.println("(reading is finished , the file gonna be closed automaticly )");

		} catch (IOException e) {
			System.out.println("Oopsie c'est une erreur d'E/S : " + e.getMessage());
		}
	}
}
