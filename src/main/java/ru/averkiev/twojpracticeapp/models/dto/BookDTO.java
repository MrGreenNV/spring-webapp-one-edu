package ru.averkiev.twojpracticeapp.models.dto;

import ru.averkiev.twojpracticeapp.models.Author;
import ru.averkiev.twojpracticeapp.models.Book;

import java.time.LocalDate;

/**
 * Описывает DTO сущности книги ({@link Book})
 * @author mrGreenNV
 */
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
     * @param bookID Идентификатор книги
     * @param bookName Название книги.
     * @param dateOfPublish Дата публикации книги.
     * @param author Автор книги.
     */
    public BookDTO(int bookID, String bookName, LocalDate dateOfPublish, Author author) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.dateOfPublish = dateOfPublish;
        this.author = author;
    }

    /**
     * Создает пустой объект {@link BookDTO}
     */
    public BookDTO() {

    }

    /**
     * Геттер для идентификатора книги.
     * @return Целое число, представляющее собой идентификатор книги.
     */
    public int getBookID() {
        return this.bookID;
    }

    /**
     * Сеттер для идентификатора книги.
     * @param newBookId Новый идентификатор книги.
     */
    public void setBookID(int newBookId) {
        this.bookID = newBookId;
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
