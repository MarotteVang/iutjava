package edu.iut.app;

import java.util.List;

public class OrCriteria implements Criteria {

   private Criteria criteria;
   private Criteria otherCriteria;

   public OrCriteria(Criteria criteria, Criteria otherCriteria) {
      this.criteria = criteria;
      this.otherCriteria = otherCriteria; 
   }

   @Override
   public List<ExamEvent> meetCriteria(List<ExamEvent> events) {
      List<ExamEvent> firstCriteriaEvents = criteria.meetCriteria(events);
      List<ExamEvent> otherCriteriaEvents = otherCriteria.meetCriteria(events);

      for (ExamEvent event : otherCriteriaEvents) {
         if(!firstCriteriaEvents.contains(event)){
            firstCriteriaEvents.add(event);
         }
      }	
      return firstCriteriaEvents;
   }
}
