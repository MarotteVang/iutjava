package edu.iut.app;

import java.util.ArrayList;
import java.util.List;

public class CriterePerson implements Critere{

	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> evenements) {
		// TODO Auto-generated method stub
		List<ExamEvent> dateEvent = new ArrayList<ExamEvent>();
		
		for (ExamEvent event : evenements) {
	         if(event.getStudent().getEmail() == "toto@tutu.fr"){
	            dateEvent.add(event);
	         }
	      }
	      return dateEvent;
	}

}
