package ru.averkiev.twojpracticeapp.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.averkiev.twojpracticeapp.dao.AuthorDAO;
import ru.averkiev.twojpracticeapp.models.Author;
import ru.averkiev.twojpracticeapp.models.views.AuthorViewModel;
import ru.averkiev.twojpracticeapp.services.AuthorService;

import java.util.List;

/**
 * Класс описывает сервис для взаимодействия с сущностями {@link Author}
 * @author mrGreenNV
 */
@Service
public class AuthorServiceImpl implements AuthorService {

    /** DAO для изменения хранящейся информации об авторах. */
    private final AuthorDAO authorDAO;

    /** Маппер для преобразования сущностей к DTO и ViewModel */
    private final ModelMapper modelMapper;

    /**
     * Внедрение зависимостей при создании сервиса.
     * @param authorDAO DAO сущность {@link Author}.
     * @param modelMapper Объект {@link ModelMapper}.
     */
    @Autowired
    public AuthorServiceImpl(AuthorDAO authorDAO, ModelMapper modelMapper) {
        this.authorDAO = authorDAO;
        this.modelMapper = modelMapper;
    }

    /**
     * Получение списка авторов.
     * @return Список представлений сущностей {@link Author}
     */
    @Override
    public List<AuthorViewModel> getAllAuthors() {
        return authorDAO.getAllAuthors().stream()
                .map(author -> modelMapper.map(author, AuthorViewModel.class))
                .toList();
    }

    /**
     * Получение автора по его идентификатору.
     * @param authorID Идентификатор автора.
     * @return Модель представления сущности {@link Author}
     */
    @Override
    public AuthorViewModel getAuthorByID(int authorID) {
        return modelMapper.map(authorDAO.getAuthor(authorID), AuthorViewModel.class);
    }

    /**
     * Обновление информации об авторе.
     * @param authorID Идентификатор обновляемого автора.
     * @param updatedAuthor Объект {@link Author} с обновленными данными.
     */
    @Override
    public void updateAuthor(int authorID, Author updatedAuthor) {
        authorDAO.updateAuthor(authorID, updatedAuthor);
    }

    /**
     * Удаление автора из хранилища.
     * @param authorID идентификатор удаляемого автора.
     */
    @Override
    public void deleteAuthorByID(int authorID) {
        authorDAO.deleteAuthor(authorID);
    }
}
