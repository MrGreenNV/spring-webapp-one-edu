package ru.averkiev.twojpracticeapp.models;

import java.time.LocalDate;

/**
 * Класс описывает модель книги.
 * @author mrGreenNV
 */
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
     * Создает объект книги с заданными параметрами.
     * Присваивает идентификатор книге и инкриминирует счетчик книг.
     * @param bookName Название книги.
     * @param dateOfPublish Дата публикации книги.
     * @param author Автор книги.
     */
    public Book(String bookName, LocalDate dateOfPublish, Author author) {
        this.bookId = ++BOOKS_COUNT;
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
     * Сеттер для названия книги.
     * @param newBookName Новое название книги.
     */
    public void setBookName(String newBookName) {
        this.bookName = newBookName;
    }

    /**
     * Геттер для даты издания книги.
     * @return LocalDate, содержащий дату издания книги.
     */
    public LocalDate getDateOfPublish() {
        return this.dateOfPublish;
    }

    /**
     * Сеттер для даты публикации книги.
     * @param newDateOfPublish Новая дата публикации книги.
     */
    public void setDateOfPublish(LocalDate newDateOfPublish) {
        this.dateOfPublish = newDateOfPublish;
    }

    /**
     * Геттер для автора книги.
     * @return {@link Author}, представляющий автора книги.
     */
    public Author getAuthor() {
        return this.author;
    }

    /**
     * Сеттер для автора книги.
     * @param newAuthor Новый автор книги.
     */
    public void setAuthor(Author newAuthor) {
        this.author = newAuthor;
    }
}
