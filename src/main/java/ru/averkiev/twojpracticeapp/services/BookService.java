package ru.averkiev.twojpracticeapp.services;

import ru.averkiev.twojpracticeapp.models.Book;
import ru.averkiev.twojpracticeapp.models.views.BookViewModel;

import java.util.List;

/**
 * Интерфейс описывает методы для взаимодействия с сущностью {@link Book}
 * @author mrGreenNV
 */
public interface BookService {

    List<BookViewModel> getAllBooks();

    BookViewModel getBookByID(int bookID);

    void updateBook(int bookID, Book updatedBook);

    void deleteBookByID(int bookID);
}
