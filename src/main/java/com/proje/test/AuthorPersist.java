package com.proje.test;

import com.proje.model.Author;
import com.proje.service.AuthorService;
import com.proje.service.impl.AuthorServiceImpl;

public class AuthorPersist {

    public static void main(String[] args) {
        AuthorService authorService = new AuthorServiceImpl();
        authorService.saveAuthor(new Author("authorNameFieldVol1"));
    }
}
