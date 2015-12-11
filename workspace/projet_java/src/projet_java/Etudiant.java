package projet_java;

import projet_java.Person.PersonFunction;

public class Etudiant extends Person{
	
	public Etudiant(){
		super();
	}
	
	public Etudiant(PersonFunction personFunction, String prenom, String nom, String email, String phone){
		super(personFunction, prenom, nom, email, phone);
	}
}
