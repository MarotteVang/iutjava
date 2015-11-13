package edu.iut.app;

import java.util.ArrayList;

public class ApplicationErrorLog extends AbstractApplicationLog {

	/** Ajouter un tableau ou profiter de l'héritage ? */
	public ApplicationErrorLog() {
		super();
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
		super.fireMessage("[ERROR]", this.message);
		for(int cpt=0; cpt<listeners.size(); cpt++){
			listeners.get(cpt).newMessage("Error", message);
		}
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<IApplicationLogListener> getpplicationLogListeners() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	void setMessage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void showMessage() {
		// TODO Auto-generated method stub
		
	}
	
	

}
