package edu.iut.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public final class Agenda extends ArrayList<ExamEvent> {
	public Agenda() {		
	}
	
	public void addCheckedEvent(ExamEvent examEvent) {
		this.add(examEvent);
	}
	public void suppCheckedEvent(Date date){
		int i=0;
		while (this.get(i).getExamDate()!=date & i!=this.size() ){
	    	i++;
	    }
		if (i!=this.size()){
			this.remove(i);
		}
	}
}
