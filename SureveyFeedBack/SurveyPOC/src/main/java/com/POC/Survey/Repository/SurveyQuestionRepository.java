package com.POC.Survey.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.POC.Survey.Entity.SurveyQuestion;

public interface SurveyQuestionRepository extends JpaRepository<SurveyQuestion, Long> {

    SurveyQuestion findBySurveyQuestionIdAndOrderNumber(Long surveyQuestionId, Long orderNumber);
}
