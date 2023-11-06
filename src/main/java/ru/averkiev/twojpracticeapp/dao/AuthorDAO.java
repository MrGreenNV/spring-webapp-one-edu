package ru.averkiev.twojpracticeapp.dao;

import org.springframework.stereotype.Component;
import ru.averkiev.twojpracticeapp.models.Author;

import java.util.List;

/**
 * Класс представляет собой DAO для хранения данных авторов книг ({@link Author}) и управления этими данными.
 * Данные хранятся в списке авторов. Можно добавить нового автора, обновить данные
 * уже существующего автора, просмотреть автора по идентификатору и удалить автора.
 * @author mrGreenNV
 */
@Component
public class AuthorDAO {

    /** Список для хранения авторов книг. */
    private List<Author> authors;

    /**
     * Позволяет получить список авторов.
     * @return Список объектов {@link Author}.
     */
    public List<Author> getAllAuthors() {
        return this.authors;
    }

    /**
     * Позволяет получить автора по заданному идентификатору.
     * @param authorID Идентификатор автора.
     * @return Объект {@link Author}.
     */
    public Author getAuthor(int authorID) {
        return authors.stream()
                .filter(author -> author.getAuthorId() == authorID)
                .findAny()
                .orElse(null);
    }

    /**
     * Позволяет добавить автора в список.
     * @param author Сохраняемый объект {@link Author}.
     */
    public void saveAuthor(Author author) {
        authors.add(author);
    }

    /**
     * Позволяет обновить автора по идентификатору.
     * @param authorID Идентификатор автора.
     * @param updatedAuthor Объект {@link Author} с обновленными данными.
     */
    public void updateAuthor(int authorID, Author updatedAuthor) {

        Author saveAuthor = this.getAuthor(authorID);

        if (saveAuthor == null) {
            System.out.println("Автор с идентификатором: " + authorID + " не найден.");
            return;
        }

        saveAuthor.setAuthorName(updatedAuthor.getAuthorName());
        saveAuthor.setDateOfBirth(updatedAuthor.getDateOfBirth());
    }

    /**
     * Позволяет удалить автора по его идентификатору из списка, если он будет найден.
     * @param authorID Идентификатор автора.
     */
    public void deleteAuthor(int authorID) {
        authors.removeIf(author -> author.getAuthorId() == authorID);
    }

}
