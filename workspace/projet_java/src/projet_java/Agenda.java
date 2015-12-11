package projet_java;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;


public class Agenda extends ArrayList<Soutenance>{
	public Agenda() {		
	}
	
	public void addCheckedEvent(Soutenance soutenance) {
		this.add(soutenance);
	}
	
	public void supprimerSoutenance(Date date, Time heure){
		int i=0;
		while (this.get(i).getDateSoutenance()!=date & i!=this.size() & this.get(i).getHeureSoutenance()!=heure){
	    	i++;
	    }
		if (i!=this.size()){
			this.remove(i);
		}
	}
}
