package ru.averkiev.twojpracticeapp.models.views;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.averkiev.twojpracticeapp.models.Author;

import java.time.LocalDate;

/**
 * Класс описывает модель представления сущности {@link Author}.
 * @author mrGreenNV
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthorViewModel {

    /** Имя автора книги. */
    private String authorName;

    /** Дата рождения автора книги. */
    private LocalDate dateOfBirth;

}
