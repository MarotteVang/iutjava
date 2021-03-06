package edu.iut.app;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPersonne implements Criteria{

	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> events) {
		List<ExamEvent> dateEvents = new ArrayList<ExamEvent>();
		String prenom = "";
		String nom = "";
		String mail = (prenom+"@"+nom+".fr");
	      
	      for (ExamEvent event : events) {
	         if(event.getStudent().getEmail()== mail){
	            dateEvents.add(event);
	         }
	      }
		return dateEvents;
	}
}