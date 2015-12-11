package edu.iut.app;

import java.util.ArrayList;
import java.util.List;

public class CritereDoc implements Critere {

	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> evenements) {
		// TODO Auto-generated method stub
		List<ExamEvent> dateEvent = new ArrayList<ExamEvent>();
		
		for (ExamEvent event : evenements) {
			ArrayList<Document> docs = new ArrayList<Document>();
			docs = event.getDocuments();
			if(docs.size() > 4){
				dateEvent.add(event);
	         }
	      }
	      return dateEvent;
	}

}
