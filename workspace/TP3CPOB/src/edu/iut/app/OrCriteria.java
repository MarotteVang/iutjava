package edu.iut.app;

import java.util.List;

public class OrCriteria implements Critere {

   private Critere criteria;
   private Critere otherCriteria;

   public OrCriteria(Critere criteria, Critere otherCriteria) {
      this.criteria = criteria;
      this.otherCriteria = otherCriteria; 
   }

   @Override
   public List<ExamEvent> meetCriteria(List<ExamEvent> evenements) {
      List<ExamEvent> firstCriteriaItems = criteria.meetCriteria(evenements);
      List<ExamEvent> otherCriteriaItems = otherCriteria.meetCriteria(evenements);

      for (ExamEvent event : otherCriteriaItems) {
         if(!firstCriteriaItems.contains(event)){
            firstCriteriaItems.add(event);
         }
      }	
      return firstCriteriaItems;
   }
}