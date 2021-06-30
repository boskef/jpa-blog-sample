package com.proje.repository;

import com.proje.model.Author;
import com.proje.model.Post;

import java.util.List;

public interface AuthorRepository{
    List<Author> getAuthors();
    Long getAuthorsCount();

    //save,update and delete transactions
    boolean saveAuthor(Author author);
    Author updateAuthor(Author author);
    boolean deleteAuthor(Author author);
}
