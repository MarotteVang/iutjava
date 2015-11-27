package edu.iut.app;

import java.util.ArrayList;
import java.util.List;

public class CriteriaDoc implements Criteria{

		
		@Override
		public List<ExamEvent> meetCriteria(List<ExamEvent> events) {
			List<ExamEvent> dateEvents = new ArrayList<ExamEvent>();
			ArrayList<Document> docs = new ArrayList<Document>();
			
		      for (ExamEvent event : events) {
		    	 docs = event.getDocuments();
		    	       if(!docs.isEmpty()){
				            dateEvents.add(event); 
		    	       }
		      }
		      return dateEvents;
		}
		
}
