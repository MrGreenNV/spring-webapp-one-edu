package ru.averkiev.twojpracticeapp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.averkiev.twojpracticeapp.models.Author;
import ru.averkiev.twojpracticeapp.models.dto.AuthorDTO;
import ru.averkiev.twojpracticeapp.models.views.AuthorViewModel;
import ru.averkiev.twojpracticeapp.services.AuthorService;
import ru.averkiev.twojpracticeapp.services.impl.AuthorServiceImpl;

import java.util.List;

/**
 * Класс представляет собой контроллер, позволяющий обращаться к сервисному слою авторов
 * книг для взаимодействия с ними.
 * @author mrGreenNV
 */
@RestController
@RequestMapping("/api/v1/authors")
public class AuthorsController {

    /** Сервис для взаимодействия с сущностями {@link Author}. */
    private final AuthorService authorService;

    /** Маппер для преобразования DTO и ViewModel к сущностям. */
    private final ModelMapper modelMapper;

    /**
     * Внедрение зависимостей при создании объекта {@link AuthorsController}
     * @param authorService Сервис для взаимодействия с сущностями {@link Author}
     * @param modelMapper Маппер для преобразования DTO и ViewModel к сущностям.
     */
    @Autowired
    public AuthorsController(AuthorServiceImpl authorService, ModelMapper modelMapper) {
        this.authorService = authorService;
        this.modelMapper = modelMapper;
    }

    /**
     * API-endpoint для отображения списка авторов книг.
     * @return Список моделей представления сущностей {@link Author}.
     */
    @GetMapping
    public List<AuthorViewModel> showAllAuthors() {
        return authorService.getAllAuthors();
    }

    /**
     * API-endpoint для отображения одного автора по идентификатору.
     * @param autorID Идентификатор автора.
     * @return Модель представления сущности {@link Author}
     */
    @GetMapping("/{autorID}")
    public AuthorViewModel showAutor(@PathVariable int autorID) {
        return authorService.getAuthorByID(autorID);
    }

    /**
     * API-endpoint для сохранения автора.
     * @param authorDTO Сохраняемый объект DTO {@link AuthorDTO}.
     */
    @PostMapping
    public void saveAuthor(@RequestBody AuthorDTO authorDTO) {
        Author author = modelMapper.map(authorDTO, Author.class);
        author.setID();
        authorService.saveAuthor(author);
    }

    /**
     * API-endpoint для обновления автора.
     * @param autorID Идентификатор автора.
     * @param updatedAuthor Объект DTO {@link AuthorDTO} с обновленными данными.
     */
    @PutMapping("/{autorID}")
    public void updateAuthor(@PathVariable int autorID, @RequestBody AuthorDTO updatedAuthor) {
        authorService.updateAuthor(autorID, modelMapper.map(updatedAuthor, Author.class));
    }

    /**
     * API-endpoint для удаления автора.
     * @param authorID Идентификатор удаляемого автора.
     */
    @DeleteMapping("/{authorID}")
    public void deleteAuthor(@PathVariable int authorID) {
        authorService.deleteAuthorByID(authorID);
    }
}
