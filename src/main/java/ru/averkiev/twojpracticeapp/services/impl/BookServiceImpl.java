package ru.averkiev.twojpracticeapp.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.averkiev.twojpracticeapp.dao.BookDAO;
import ru.averkiev.twojpracticeapp.models.Book;
import ru.averkiev.twojpracticeapp.models.views.BookViewModel;
import ru.averkiev.twojpracticeapp.services.BookService;

import java.util.List;

/**
 * Класс описывает сервис для взаимодействия с сущностями {@link Book}
 * @author mrGreenNV
 */
@Service
public class BookServiceImpl implements BookService {

    /** DAO для изменения хранящейся информации о книгах. */
    private final BookDAO bookDAO;

    /** Маппер для преобразования сущностей к DTO и ViewModel */
    private final ModelMapper modelMapper;

    /**
     * Внедрение зависимостей при создании сервиса.
     * @param bookDAO DAO сущность {@link Book}
     * @param modelMapper Объект {@link ModelMapper}
     */
    @Autowired
    public BookServiceImpl(BookDAO bookDAO, ModelMapper modelMapper) {
        this.bookDAO = bookDAO;
        this.modelMapper = modelMapper;
    }

    /**
     * Получение списка представлений книг.
     * @return Список представлений сущностей {@link Book}
     */
    @Override
    public List<BookViewModel> getAllBooks() {
        return bookDAO.getAllBooks().stream()
                .map(book -> modelMapper.map(book, BookViewModel.class))
                .toList();
    }

    /**
     * Получение модели представления книги по её идентификатору.
     * @param bookID Идентификатор книги.
     * @return Модель представления сущности {@link Book}
     */
    @Override
    public BookViewModel getBookByID(int bookID) {
        return modelMapper.map(bookDAO.getBook(bookID), BookViewModel.class);
    }

    /**
     * Сохранение книги в списке.
     * @param book Сохраняемый объект {@link Book}
     */
    @Override
    public void saveBook(Book book) {
        bookDAO.saveBook(book);
    }

    /**
     * Обновление информации о книге.
     * @param bookID Идентификатор книги.
     * @param updatedBook Объект {@link Book} с обновленными данными.
     */
    @Override
    public void updateBook(int bookID, Book updatedBook) {

    }

    /**
     * Удаление книги по её идентификатору.
     * @param bookID Идентификатор книги.
     */
    @Override
    public void deleteBookByID(int bookID) {

    }
}
