package com.book.dao;


import com.book.basicTypes.Book;
import com.book.basicTypes.BookList;
import com.book.exceptions.DaoException;

public interface Dao {
    BookList searchAuthor (String author) throws DaoException;
    BookList searchAuthorTitle (String author, String title) throws DaoException;
    BookList searchRandonWords (String description) throws DaoException;
    Long addBook (Book book) throws DaoException;
    void downloadBook (Book book) throws DaoException;
    BookList searchAllBooks () throws DaoException;
}
