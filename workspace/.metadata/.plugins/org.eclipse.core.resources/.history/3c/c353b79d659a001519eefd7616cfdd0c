package edu.iut.app;

import java.util.List;

public class AndCriteria implements Criteria {

   private Criteria criteria;
   private Criteria otherCriteria;

   public AndCriteria(Criteria criteria, Criteria otherCriteria) {
      this.criteria = criteria;
      this.otherCriteria = otherCriteria; 
   }


   @Override
   public List<ExamEvent> meetCriteria(List<ExamEvent> events) {
	   		List<ExamEvent> firstCriteriaEvents = criteria.meetCriteria(events);		
	      return otherCriteria.meetCriteria(firstCriteriaEvents);
   }
}