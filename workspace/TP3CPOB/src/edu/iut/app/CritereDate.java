package edu.iut.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CritereDate implements Critere {

	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> evenements) {
		List<ExamEvent> dateEvent = new ArrayList<ExamEvent>(); 
		Date date = new Date();
	      
	      for (ExamEvent event : evenements) {
	         if(event.getExamDate().after(date)){
	            dateEvent.add(event);
	         }
	      }
	      return dateEvent;
	}

}
