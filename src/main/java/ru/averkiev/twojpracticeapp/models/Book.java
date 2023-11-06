package ru.averkiev.twojpracticeapp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Класс описывает модель книги.
 * @author mrGreenNV
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    /** Счетчик книг. */
    private static int BOOKS_COUNT = 0;

    /** Идентификатор книги. */
    private int bookId;

    /** Название книги. */
    private String bookName;

    /** Дата издания книги. */
    private LocalDate dateOfPublish;

    /** Автор книги. */
    Author author;

    /**
     * Назначает идентификатор книге.
     */
    public void setID() {
        this.bookId = ++BOOKS_COUNT;
    }
}
