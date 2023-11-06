package ru.averkiev.twojpracticeapp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Класс описывает модель автора книг.
 * @author mrGreenNV
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    /** Счетчик авторов. */
    private static int AUTHORS_COUNT = 0;

    /** Идентификатор автора книги. */
    private int authorId;

    /** Имя автора книги. */
    private String authorName;

    /** Дата рождения автора книги. */
    private LocalDate dateOfBirth;

    /**
     * Назначает идентификатор автору.
     */
    public void setID() {
        this.authorId = ++AUTHORS_COUNT;
    }
}
