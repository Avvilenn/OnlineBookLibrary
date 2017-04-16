package com.book.basicTypes;

import java.util.List;


public class BookList {
    private List <Book>bookList;

    public BookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public BookList() {
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
