package com.proje.service.impl;

import com.proje.model.Author;
import com.proje.repository.AuthorRepository;
import com.proje.repository.impl.AuthorRepositoryImpl;
import com.proje.service.AuthorService;

import java.util.List;

public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository = new AuthorRepositoryImpl();
    @Override
    public List<Author> getAuthors() {
        return authorRepository.getAuthors();
    }

    @Override
    public Long getAuthorsCount() {
        return authorRepository.getAuthorsCount();
    }

    @Override
    public boolean saveAuthor(Author author) {
        return authorRepository.saveAuthor(author);
    }

    @Override
    public Author updateAuthor(Author author) {
        return authorRepository.updateAuthor(author);
    }

    @Override
    public boolean deleteAuthor(Author author) {
        return authorRepository.deleteAuthor(author);
    }
}
