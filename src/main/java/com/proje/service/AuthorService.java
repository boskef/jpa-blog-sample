package com.proje.service;

import com.proje.model.Author;

import java.util.List;

public interface AuthorService {
    List<Author> getAuthors();
    Long getAuthorsCount();

    //save,update and delete transactions
    boolean saveAuthor(Author author);
    Author updateAuthor(Author author);
    boolean deleteAuthor(Author author);
}
