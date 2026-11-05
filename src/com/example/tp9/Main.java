package com.example.tp9;

public class Main {
	public static void main(String[] args) {
// create cl 
		Calculator cl = new Calculator();

		System.out.println("addition test ");
		System.out.println("6+7 = " + cl.add(6, 7));
		System.out.println("division test  ");
		try {

			System.out.println("18/4 =  " + cl.divide(18, 4));
//	     we should be specific about what type of exception is this 
		} catch (IllegalArgumentException e) {

			System.out.println("this won't arithmetic error : " + e.getMessage());

		}
		System.out.println("division test  ");
		try {
			System.out.println("18/0 =  " + cl.divide(18, 0));
//	     we should be specific about what type of exception is this 
		} catch (IllegalArgumentException e) {

			System.out.println("this won't arithmetic error : " + e.getMessage());

		}
		System.out.println(" Test of reding the file ");
		FileReaderUtil fileUtil = new FileReaderUtil();

		// test with a file that doesn't excist
		fileUtil.readFileModern("fichier_mystere.txt");

		// PARTIE 3 : user and LOG
		System.out.println("Test of creating the user  ");
		try {
			User u1 = new User("Riri", 150);
			System.out.println("User created : " + u1.getNom());
		} catch (InvalidUserException e) {
			System.out.println("not working : " + e.getMessage());
			// we add this to the file errur
			LoggerUtil.logError("Created user that didn't work  -> " + e.getMessage());
		}

	}

}
