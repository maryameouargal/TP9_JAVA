package com.example.tp9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class LoggerUtil {
	public static void logError(String message) {
		// "true" permet THAT CAN ADD THE SUIVI OF THE FILE
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("erreurs.txt", true))) {

			writer.write("[" + LocalDateTime.now() + "] " + message);
			writer.newLine();

		} catch (IOException e) {
			System.out.println("Oopsie it's impossible to write  the file   : " + e.getMessage());
		}
	}
}
