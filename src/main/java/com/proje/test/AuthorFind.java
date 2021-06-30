package com.proje.test;

import com.proje.model.Author;
import com.proje.service.AuthorService;
import com.proje.service.impl.AuthorServiceImpl;

import java.util.List;

public class AuthorFind {
    public static void main(String[] args) {
        AuthorService authorService = new AuthorServiceImpl();
        List<Author> authorList = authorService.getAuthors();
        authorList.forEach(System.out::println);

        System.out.println("AuthorsCount:" + authorService.getAuthorsCount());
    }
}
