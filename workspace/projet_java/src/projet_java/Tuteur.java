package projet_java;

import projet_java.Person.PersonFunction;

public class Tuteur extends Person{
	
	public Tuteur(){
		super();
	}
	
	public Tuteur(PersonFunction personFunction, String prenom, String nom, String email, String phone){
		super(personFunction, prenom, nom, email, phone);
	}
}
