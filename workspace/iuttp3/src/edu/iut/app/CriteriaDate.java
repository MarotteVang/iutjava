package edu.iut.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CriteriaDate implements Criteria{

	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> events) {
		List<ExamEvent> dateEvents = new ArrayList<ExamEvent>();
		Date date1 = new Date();
	      
	      for (ExamEvent event : events) {
	         if(event.getExamDate().after(date1)){
	            dateEvents.add(event);
	         }
	      }
		return dateEvents;
	}

}
