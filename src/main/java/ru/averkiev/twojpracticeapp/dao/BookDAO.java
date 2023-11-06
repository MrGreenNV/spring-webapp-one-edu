package ru.averkiev.twojpracticeapp.dao;

import org.springframework.stereotype.Component;
import ru.averkiev.twojpracticeapp.models.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс представляет собой DAO для хранения данных книг ({@link Book}) и управления этими данными.
 * Данные хранятся в списке авторов. Можно добавить нового автора, обновить данные
 * уже существующего автора, просмотреть автора по идентификатору и удалить автора.
 * @author mrGreenNV
 */
@Component
public class BookDAO {

    /** Список для хранения книг. */
    private final List<Book> books = new ArrayList<>();

    /**
     * Позволяет получить список всех книг.
     * @return Список объектов {@link Book}
     */
    public List<Book> getAllBooks() {
        return this.books;
    }

    /**
     * Позволяет получить книгу по заданному идентификатору.
     * @param bookID Идентификатор книги.
     * @return Объект {@link Book}
     */
    public Book getBook(int bookID) {
        return books.stream()
                .filter(book -> book.getBookId() == bookID)
                .findAny()
                .orElse(null);
    }

    /**
     * Позволяет добавить книгу в список.
     * @param book Сохраняемый объект {@link Book}
     */
    public void saveBook(Book book) {
        books.add(book);
    }

    /**
     * Позволяет обновить книгу по идентификатору.
     * @param bookID Идентификатор книги.
     * @param updatedBook Объект {@link Book} с обновленными данными.
     */
    public void updateBook(int bookID, Book updatedBook) {

        Book saveBook = this.getBook(bookID);

        if (saveBook == null) {
            System.out.println("Книга с идентификатором: " + bookID + " не найдена.");
            return;
        }

        saveBook.setBookName(updatedBook.getBookName());
        saveBook.setDateOfPublish(updatedBook.getDateOfPublish());
        saveBook.setAuthor(updatedBook.getAuthor());
    }

    /**
     * Позволяет удалить книгу по её идентификатору из списка, если она будет найдена.
     * @param bookID Идентификатор книги.
     */
    public void deleteBook(int bookID) {
        books.removeIf(book -> book.getBookId() == bookID);
    }
}
