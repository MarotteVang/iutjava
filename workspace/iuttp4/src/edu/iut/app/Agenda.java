package edu.iut.app;

import java.util.LinkedList;

import javax.lang.model.element.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.stream.events.Comment;


public class Agenda extends LinkedList<ExamEvent> {
	
	DocumentBuilder document;
	Document doc;
	Element root;
	Comment comment;
	
	public Agenda() {		
	}
	
	public void addCheckedEvent(ExamEvent examEvent) {
		this.add(examEvent);
	}
	
}
