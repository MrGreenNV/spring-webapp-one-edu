package ru.averkiev.twojpracticeapp.models.views;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.averkiev.twojpracticeapp.models.Author;
import ru.averkiev.twojpracticeapp.models.Book;

import java.time.LocalDate;

/**
 * Класс описывает модель представления сущности {@link Book}.
 * @author mrGreenNV
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookViewModel {

    /** Название книги. */
    private String bookName;

    /** Дата издания книги. */
    private LocalDate dateOfPublish;

    /** Автор книги. */
    Author author;
}
