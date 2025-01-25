package by.java.InterviewsApi.questionHub.repository;

import by.java.InterviewsApi.questionHub.data.QuestionCategory;
import by.java.InterviewsApi.questionHub.data.Questions;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Data
public class QuestionsRepositoryImpl implements QuestionsRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public Questions getQuestionById(Long id) {
        return null;
    }

    @Override
    public List<Questions> getByCategory(QuestionCategory category) {
        return null;
    }
}
