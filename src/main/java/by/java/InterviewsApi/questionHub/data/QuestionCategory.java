package by.java.InterviewsApi.questionHub.data;

import lombok.Getter;

import java.util.Objects;

@Getter
public enum QuestionCategory {

    JAVA_CORE_1("Java Core 1"),
    JAVA_CORE_2("Java Core 2"),
    MULTITHREADING("Многопоточность"),
    SQL("SQL и базы данных"),
    HIBERNATE("Hibernate"),
    SPRING("Spring framework"),
    ALGORITHMS("Алгоритмы"),
    PATTERNS("Паттерны"),
    MICROSERVICES("Микро-сервисная архитектура"),
    MICROSERVICES_PATTERNS("Паттерны микро-сервисной архитектуры"),
    DEFAULT("Прочее");

    private final String descriptions;

    QuestionCategory(String descriptions) {
        this.descriptions = descriptions;
    }

    public static QuestionCategory fromString(String value) {
        for (QuestionCategory category : QuestionCategory.values()) {
            if (Objects.equals(category.name(), value)) {
                return category;
            }
        }
        return DEFAULT;
    }
}
