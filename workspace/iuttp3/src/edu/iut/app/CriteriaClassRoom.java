package edu.iut.app;

import java.util.ArrayList;
import java.util.List;

public class CriteriaClassRoom implements Criteria{

		
		@Override
		public List<ExamEvent> meetCriteria(List<ExamEvent> events) {
			List<ExamEvent> dateEvents = new ArrayList<ExamEvent>();
			
		      for (ExamEvent event : events) {
		         if(event.getClassroom().getClassRoomNumber()=="1"){
		            dateEvents.add(event);
		         }
		      }
		      return dateEvents;
		}
		
}
