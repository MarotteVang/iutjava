package edu.iut.app;

import java.util.ArrayList;

public class ApplicationWarningLog extends AbstractApplicationLog {

	/** Ajouter un tableau ou profiter de l'héritage ? */
	public ApplicationWarningLog() {
		super();
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
		super.fireMessage("[WARNING]", this.message);
		for(int cpt=0; cpt<listeners.size(); cpt++){
			listeners.get(cpt).newMessage("Warning", message);
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