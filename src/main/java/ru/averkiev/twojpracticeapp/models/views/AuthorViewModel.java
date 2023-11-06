package ru.averkiev.twojpracticeapp.models.views;

import ru.averkiev.twojpracticeapp.models.Author;

import java.time.LocalDate;

/**
 * Класс описывает модель представления сущности {@link Author}.
 * @author mrGreenNV
 */
public class AuthorViewModel {

    /** Имя автора книги. */
    private String authorName;

    /** Дата рождения автора книги. */
    private LocalDate dateOfBirth;

    /**
     * Создает пустую модель представления автора книги.
     */
    public AuthorViewModel() {}

    /**
     * Создает модель представления автора книги с заданными параметрами.
     * Инкриминирует счетчик и назначает идентификатор автору.
     * @param authorName Имя автора книги.
     * @param dateOfBirth Дата рождения автора книги.
     */
    public AuthorViewModel(String authorName, LocalDate dateOfBirth) {
        this.authorName = authorName;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Геттер для имени автора.
     * @return Строку, содержащую имя автора книги.
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * Сеттер для имени автора.
     * @param newAuthorName Новое имя автора.
     */
    public void setAuthorName(String newAuthorName) {
        this.authorName = newAuthorName;
    }

    /**
     * Геттер для даты рождения автора.
     * @return LocalDate, содержащий дату рождения автора.
     */
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Сеттер для даты рождения автора.
     * @param newDateOfBirth Новая дата рождения автора.
     */
    public void setDateOfBirth(LocalDate newDateOfBirth) {
        this.dateOfBirth = newDateOfBirth;
    }
}
