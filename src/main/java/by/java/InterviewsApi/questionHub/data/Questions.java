package by.java.InterviewsApi.questionHub.data;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
@Table
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Questions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long idQuestions;

    private String text;

    @Enumerated(value = EnumType.STRING)
    private QuestionCategory category;

    @OneToMany(mappedBy = "questions", fetch = FetchType.LAZY)
    List<Answers> answers;
}