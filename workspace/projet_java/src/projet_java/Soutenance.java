package projet_java;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Soutenance {
	private Date dateSoutenance;
	private Time heureSoutenance;
	private Person student;
	private ArrayList<Person> jury; //Ne peut �tre rempli par des �tudiants !
	private String salle;
	
	public Soutenance() {
		this.dateSoutenance = null;
		this.heureSoutenance = null;
		this.student = new Etudiant();
		this.jury= new ArrayList<Person>();
		this.salle = "";
	}
	
	public Soutenance(Date date, Time heure, Person student, ArrayList<Person> jury){
		this.dateSoutenance=date;
		this.heureSoutenance=heure;
		this.student=student;
		this.jury=jury;
		this.salle="";
	}

	public String getSalle() {
		return salle;
	}

	public void setSalle(String salle) {
		this.salle = salle;
	}

	public Date getDateSoutenance() {
		return dateSoutenance;
	}

	public void setDateSoutenance(Date dateSoutenance) {
		this.dateSoutenance = dateSoutenance;
	}

	public Time getHeureSoutenance() {
		return heureSoutenance;
	}

	public void setHeureSoutenance(Time heureSoutenance) {
		this.heureSoutenance = heureSoutenance;
	}

	public Person getStudent() {
		return student;
	}

	public void setStudent(Person student) {
		this.student = student;
	}

	public ArrayList<Person> getJury() {
		return jury;
	}

	public void setJury(ArrayList<Person> jury) {
		this.jury = jury;
	}
}
