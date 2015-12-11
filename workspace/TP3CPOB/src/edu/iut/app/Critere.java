package edu.iut.app;

import java.util.List;

public interface Critere {
	public List<ExamEvent> meetCriteria(List<ExamEvent> evenements);
}
