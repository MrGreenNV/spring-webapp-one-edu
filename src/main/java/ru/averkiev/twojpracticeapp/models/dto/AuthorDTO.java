package ru.averkiev.twojpracticeapp.models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.averkiev.twojpracticeapp.models.Author;

import java.time.LocalDate;

/**
 * Описывает DTO сущности автора книги ({@link Author})
 * @author mrGreenNV
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDTO {

    /** Идентификатор автора книги. */
    private int authorId;

    /** Имя автора книги. */
    private String authorName;

    /** Дата рождения автора книги. */
    private LocalDate dateOfBirth;

    /**
     * Создает автора книги с заданными параметрами.
     * Инкриминирует счетчик и назначает идентификатор автору.
     * @param authorName Имя автора книги.
     * @param dateOfBirth Дата рождения автора книги.
     */
    public AuthorDTO(String authorName, LocalDate dateOfBirth) {
        this.authorName = authorName;
        this.dateOfBirth = dateOfBirth;
    }
}
