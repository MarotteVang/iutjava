package edu.iut.app;

import java.util.ArrayList;
import java.util.Date;

public class ExamEvent {
	public ExamEvent() {
		this.examDate=null;
		this.student= new Person();
		this.jury= new ArrayList<Person>();
		
	}
	public ExamEvent(Date date) {
		this.examDate=date;
		this.student= new Person();
		this.jury= new ArrayList<Person>();
		
	}
	
	public ExamEvent(Date date, Person person, ArrayList<Person> jury,
					Classroom classRoom, ArrayList<Document> document) {
		this.examDate=date;
		this.student= person;
		this.jury=jury;
		this.classroom=classRoom;
		this.documents=document;
		
	}
	
	/** EX2: FAITES LES ACCESSEURS DES ATTRIBUTS, AJOUTER DES ATTRIBUT ? **/
	protected Date examDate;
	protected Person student;
	protected ArrayList<Person> jury;
	protected Classroom classroom;
	protected ArrayList<Document> documents;
	
	
	
	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
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

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	public ArrayList<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(ArrayList<Document> documents) {
		this.documents = documents;
	}
	
	
	
	
	 
}
