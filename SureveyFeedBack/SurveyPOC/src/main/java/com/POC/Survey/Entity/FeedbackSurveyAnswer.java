package com.POC.Survey.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FeedbackSurveyAnswer {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long  surveyAnswerId;
		private String comments;
		private Integer rating;
		
		@JoinColumn(name = "survey_question_id")
		private Long surveyQuestionId;
		
		@JoinColumn(name = "feedback_user_id")
		private Long feedbackUserId;
		
}
