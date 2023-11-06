package ru.averkiev.twojpracticeapp.models.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.averkiev.twojpracticeapp.models.Author;
import ru.averkiev.twojpracticeapp.models.Book;

import java.time.LocalDate;

/**
 * Описывает DTO сущности книги ({@link Book})
 * @author mrGreenNV
 */
@Getter
@Setter
@NoArgsConstructor
public class BookDTO {

    /** Идентификатор книги. */
    private int bookID;

    /** Название книги. */
    private String bookName;

    /** Дата издания книги. */
    private LocalDate dateOfPublish;

    /** Автор книги. */
    Author author;

    /**
     * Создает объект DTO книги с заданными параметрами.
     * Присваивает идентификатор книге и инкриминирует счетчик книг.
     * @param bookName Название книги.
     * @param dateOfPublish Дата публикации книги.
     * @param author Автор книги.
     */
    public BookDTO(String bookName, LocalDate dateOfPublish, Author author) {
        this.bookName = bookName;
        this.dateOfPublish = dateOfPublish;
        this.author = author;
    }
}
