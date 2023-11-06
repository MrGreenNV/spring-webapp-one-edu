package ru.averkiev.twojpracticeapp.services;

import ru.averkiev.twojpracticeapp.models.Author;
import ru.averkiev.twojpracticeapp.models.views.AuthorViewModel;

import java.util.List;

/**
 * Интерфейс описывает методы для взаимодействия с сущностью {@link Author}
 * @author mrGreenNV
 */
public interface AuthorService {

    List<AuthorViewModel> getAllAuthors();

    AuthorViewModel getAuthorByID(int authorID);

    void updateAuthor(int authorID, Author updatedAuthor);

    void deleteAuthorByID(int authorID);
}
