package com.POC.Survey.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.POC.Survey.Entity.SurveyQuestion;

@Service
public interface SurveyQuestionService {

	public List<SurveyQuestion> getAllFeedbackSurveyQuestion();
	
	public SurveyQuestion getFeedbackSurveyQuestionById(Long surveyQuestionId);
	
	public SurveyQuestion addFeedbackSurveyQuestion(SurveyQuestion surveyQuestion);
	
	public SurveyQuestion updateFeedbackSurveyQuestion(SurveyQuestion surveyQuestion);
	
	public SurveyQuestion deleteFeedbackSurveyQuestion(Long  surveyQuestionId);
	
	public SurveyQuestion getFeedbackSurveyQuestionByFeedbackSurveyIdandOrderNo(Long SurveyQuestionId, Long OrderNo);
	
}
