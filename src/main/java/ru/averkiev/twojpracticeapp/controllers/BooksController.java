package ru.averkiev.twojpracticeapp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.averkiev.twojpracticeapp.models.Book;
import ru.averkiev.twojpracticeapp.models.dto.BookDTO;
import ru.averkiev.twojpracticeapp.models.views.BookViewModel;
import ru.averkiev.twojpracticeapp.services.BookService;
import ru.averkiev.twojpracticeapp.services.impl.BookServiceImpl;

import java.util.List;

/**
 * Класс представляет собой контроллер, позволяющий обращаться к сервисному слою книг для взаимодействия с ними.
 * @author mrGreenNV
 */
@RestController
@RequestMapping("/api/v1/books")
public class BooksController {

    /** Сервис для взаимодействия с сущностями {@link Book}. */
    private final BookService bookService;

    /** Маппер для преобразования DTO и ViewModel к сущностям. */
    private final ModelMapper modelMapper;

    /**
     * Внедрение зависимостей при создании объекта {@link BooksController}
     * @param bookService Сервис для взаимодействия с сущностями {@link Book}
     * @param modelMapper Маппер для преобразования DTO и ViewModel к сущностям.
     */
    @Autowired
    public BooksController(BookServiceImpl bookService, ModelMapper modelMapper) {
        this.bookService = bookService;
        this.modelMapper = modelMapper;
    }

    /**
     * API-endpoint для отображения списка книг.
     * @return Список моделей представления сущностей {@link Book}.
     */
    @GetMapping
    public List<BookViewModel> showAllBooks() {
        return bookService.getAllBooks();
    }

    /**
     * API-endpoint для отображения одной книги по идентификатору.
     * @param bookID Идентификатор книги.
     * @return Модель представления сущности {@link Book}
     */
    @GetMapping("/{bookID}")
    public BookViewModel showBook(@PathVariable int bookID) {
        return bookService.getBookByID(bookID);
    }

    /**
     * API-endpoint для сохранения книги.
     * @param bookDTO Сохраняемый объект DTO {@link BookDTO}.
     */
    @PostMapping
    public void saveBook(@RequestBody BookDTO bookDTO) {
        Book book = modelMapper.map(bookDTO, Book.class);
        book.setID();
        bookService.saveBook(book);
    }
    /**
     * API-endpoint для обновления книги.
     * @param bookID Идентификатор книги.
     * @param updatedBook Объект DTO {@link BookDTO} с обновленными данными.
     */
    @PutMapping("/{bookID}")
    public void updateBook(@PathVariable int bookID, @RequestBody BookDTO updatedBook) {
        bookService.updateBook(bookID, modelMapper.map(updatedBook, Book.class));
    }

    /**
     * API-endpoint для удаления книги.
     * @param bookID Идентификатор удаляемой книги.
     */
    @DeleteMapping("/{bookID}")
    public void deleteBook(@PathVariable int bookID) {
        bookService.deleteBookByID(bookID);
    }

}
