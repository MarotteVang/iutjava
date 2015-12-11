package edu.iut.app;

import java.util.List;

public class AndCriteria implements Critere {

   private Critere criteria;
   private Critere otherCriteria;

   public AndCriteria(Critere criteria, Critere otherCriteria) {
      this.criteria = criteria;
      this.otherCriteria = otherCriteria; 
   }

   @Override
   public List<ExamEvent> meetCriteria(List<ExamEvent> evenements) {
   
      List<ExamEvent> firstCriteriaEvents = criteria.meetCriteria(evenements);		
      return otherCriteria.meetCriteria(firstCriteriaEvents);
   }
}