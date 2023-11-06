package ru.averkiev.twojpracticeapp.models;

import java.time.LocalDate;

/**
 * Класс описывает модель книги.
 * @author mrGreenNV
 */
public class Book {

    /** Счетчик книг. */
    private static int bookCount = 0;

    /** Идентификатор книги. */
    private int bookId;

    /** Название книги. */
    private final String bookName;

    /** Дата издания книги. */
    private final LocalDate dateOfPublish;

    /** Автор книги. */
    Author author;

    /**
     * Создает объект книги с заданными параметрами.
     * Присваивает идентификатор книге и инкриминирует счетчик книг.
     * @param bookName Название книги.
     * @param dateOfPublish Дата публикации книги.
     * @param author Автор книги.
     */
    public Book(String bookName, LocalDate dateOfPublish, Author author) {
        this.bookId = ++bookCount;
        this.bookName = bookName;
        this.dateOfPublish = dateOfPublish;
        this.author = author;
    }

    /**
     * Геттер для идентификатора книги.
     * @return Целое число, представляющее собой идентификатор книги.
     */
    public int getBookId() {
        return this.bookId;
    }

    /**
     * Сеттер для идентификатора книги.
     * @param newBookId Новый идентификатор книги.
     */
    public void setBookId(int newBookId) {
        this.bookId = newBookId;
    }

    /**
     * Геттер для названия книги.
     * @return Строку, содержащую название книги.
     */
    public String getBookName() {
        return this.bookName;
    }

    /**
     * Геттер для даты издания книги.
     * @return LocalDate, содержащий дату издания книги.
     */
    public LocalDate getDateOfPublish() {
        return this.dateOfPublish;
    }

    /**
     * Геттер для автора книги.
     * @return {@link Author}, представляющий автора книги.
     */
    public Author getAuthor() {
        return this.author;
    }
}
