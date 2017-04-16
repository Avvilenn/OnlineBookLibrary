package com.book.managers;


import com.book.basicTypes.Book;
import com.book.basicTypes.BookList;

public class BookManager {
    private static BookManager ourInstance = new BookManager();

    public static BookManager getInstance() {
        return ourInstance;
    }

    private BookManager() {
    }

    public BookList searchAuthor (String author) {
        return null;
    }

    public BookList searchAuthorTitle (String author, String title) {
        return null;
    }

    public BookList searchRandonWords (String description){
        return null;
    }

    public Long addBook (Book book){
        return null;
    }

    public void downloadBook (Book book) {

    }
    public BookList searchAllBooks (){
        return null;
    }
}
