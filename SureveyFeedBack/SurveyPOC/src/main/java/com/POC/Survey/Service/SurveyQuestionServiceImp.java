package com.POC.Survey.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.POC.Survey.Entity.SurveyQuestion;
import com.POC.Survey.Repository.SurveyQuestionRepository;

@Service
public class SurveyQuestionServiceImp implements SurveyQuestionService {

	@Autowired
	private  SurveyQuestionRepository surveyQuestionRepository;
	
	@Override
	public List<SurveyQuestion> getAllFeedbackSurveyQuestion() {
		return surveyQuestionRepository.findAll();
	}

	@Override
	public SurveyQuestion getFeedbackSurveyQuestionById(Long surveyQuestionId) {
		return surveyQuestionRepository.findById(surveyQuestionId)
				.stream()
				.findFirst()
				.orElse(null);
	}

	@Override
	public SurveyQuestion addFeedbackSurveyQuestion(SurveyQuestion surveyQuestion) {
		return surveyQuestionRepository.save(surveyQuestion);
	}

	@Override
	public SurveyQuestion updateFeedbackSurveyQuestion(SurveyQuestion surveyQuestion) {
		return surveyQuestionRepository.save(surveyQuestion);
	}

	@Override
	public SurveyQuestion deleteFeedbackSurveyQuestion(Long surveyQuestionId) {
		SurveyQuestion surveyQuestionData =  surveyQuestionRepository.findById(surveyQuestionId).orElse(null);
		if(surveyQuestionData != null) {
			surveyQuestionRepository.delete(surveyQuestionData);
			return surveyQuestionData;
		} else {
			return null;
		}	
	}

	@Override
	public SurveyQuestion getFeedbackSurveyQuestionByFeedbackSurveyIdandOrderNo(Long SurveyQuestionId, Long OrderNo) {
		return surveyQuestionRepository.findBySurveyQuestionIdAndOrderNumber(SurveyQuestionId, OrderNo);	
	}

}
