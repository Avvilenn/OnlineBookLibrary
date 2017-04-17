package com.book.dao;


import com.book.basicTypes.Book;
import com.book.basicTypes.BookList;
import com.book.exceptions.DaoException;

import java.sql.Connection;

public class BookDao implements Dao {
    private Connection getConnection() throws Exception {
        return ConnectionBuilder.getConnection();
    }

    @Override
    public BookList searchAuthor(String author) throws DaoException {
        return null;
    }

    @Override
    public BookList searchAuthorTitle(String author, String title) throws DaoException {
        return null;
    }

    @Override
    public BookList searchRandonWords(String description) throws DaoException {
        return null;
    }

    @Override
    public Long addBook(Book book) throws DaoException {
        return null;
    }

    @Override
    public void downloadBook(Book book) throws DaoException {

    }

    @Override
    public BookList searchAllBooks() throws DaoException {
        return null;
    }
}
