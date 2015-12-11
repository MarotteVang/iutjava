package projet_java;

public abstract class Person {
	
	public enum PersonFunction{
		NONE("None"),
		JURY("Jury"),
		STUDENT("Student");
		
		private String personFunction;
		
		PersonFunction(String personFunction) {
			this.personFunction = personFunction;
		}
		
		public String toString() {
			return personFunction;
		}		
	}
	
	public Person() {
		personFunction = PersonFunction.NONE;
	}
	
	public Person(PersonFunction personFunction, String prenom, String nom, String email, String phone) {
		this.personFunction=personFunction;
		this.prenom = prenom;
		this.nom=nom;
		this.email=email;
		this.phone=phone;
	}
	
	public PersonFunction getPersonFunction() {
		return personFunction;
	}

	public void setPersonFunction(PersonFunction personFunction) {
		this.personFunction = personFunction;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}

	
	protected PersonFunction personFunction;
	protected String prenom;
	protected String nom;
	protected String email;
	protected String phone;
	

}

