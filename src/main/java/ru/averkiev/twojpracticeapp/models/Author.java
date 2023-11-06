package ru.averkiev.twojpracticeapp.models;

import java.time.LocalDate;

/**
 * Класс описывает модель автора книг.
 * @author mrGreenNV
 */
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
     * Создает автора книги с заданными параметрами.
     * Инкриминирует счетчик и назначает идентификатор автору.
     * @param authorName Имя автора книги.
     * @param dateOfBirth Дата рождения автора книги.
     */
    public Author(String authorName, LocalDate dateOfBirth) {
        this.authorId = ++AUTHORS_COUNT;
        this.authorName = authorName;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Геттер для идентификатора автора.
     * @return Целое число, представляющее идентификатор автора.
     */
    public int getAuthorId() {
        return this.authorId;
    }

    /**
     * Сеттер для идентификатора автора.
     * @param newAuthorId Новый идентификатор автора книги.
     */
    public void setAuthorId(int newAuthorId) {
        this.authorId = newAuthorId;
    }

    /**
     * Геттер для имени автора.
     * @return Строку, содержащую имя автора книги.
     */
    public String getAuthorName() {
        return this.authorName;
    }

    /**
     * Сеттер для имени автора.
     * @param newAuthorName Новое имя автора.
     */
    public void setAuthorName(String newAuthorName) {
        this.authorName = authorName;
    }


    /**
     * Геттер для даты рождения автора.
     * @return LocalDate, содержащий дату рождения автора.
     */
    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    /**
     * Сеттер для даты рождения автора.
     * @param newDateOfBirth Новая дата рождения автора.
     */
    public void setDateOfBirth(LocalDate newDateOfBirth) {
        this.dateOfBirth = newDateOfBirth;
    }
}
