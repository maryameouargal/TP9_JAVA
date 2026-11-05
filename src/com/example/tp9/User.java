package com.example.tp9;

public class User {
	private String nom;
	private int age;

	// the consturtor using source
	public User(String nom, int age) throws InvalidUserException {
//       verify the name 
		if (nom == null || nom.trim().isEmpty()) {
			throw new InvalidUserException("Eurror the name is empty  it's refused .");
		}

		// verify the age
		if (age < 0 || age > 120) {
			throw new InvalidUserException("Eurror : the age " + age + " it's not logic .");
		}

		this.nom = nom;
		this.age = age;
	}

//	THE GETTERS USING SOURCE 
	public String getNom() {
		return nom;
	}

	public int getAge() {
		return age;
	}

}
