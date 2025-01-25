package by.java.InterviewsApi.questionHub.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
@Table
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Answers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String text;
    private boolean isCorrect;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinTable(name = "question_answers",
        joinColumns = @JoinColumn(name = "id_answer"),
        inverseJoinColumns = @JoinColumn(name = "id_questions")
    )
    private Questions questions;
    //todo !!если в вопросе будет несколько правильных ответов. я думал что надо из бд дёрнуть все
    // isCorrect=true для текущего вопроса и начислить (0/0.25/0.33/0.5/0.66/0.75/1 или проще за
    // вопрос 4балла если правильный 1 вариант то за него 4. а если 4 тогда за каждый правильный
    // отвеченный 1 бал// )
}