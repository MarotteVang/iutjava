package edu.iut.app;

import java.util.ArrayList;

public interface IApplicationLog {
	void setMessage(String message);
	String getMessage();
	void addListener(IApplicationLogListener listener);
	ArrayList<IApplicationLogListener> getpplicationLogListeners();
}
