package by.java.InterviewsApi.questionHub.repository;

import by.java.InterviewsApi.questionHub.data.QuestionCategory;
import by.java.InterviewsApi.questionHub.data.Questions;

import java.util.List;

public interface QuestionsRepository {

    Questions getQuestionById(Long id);

    List<Questions> getByCategory(QuestionCategory category);
}
