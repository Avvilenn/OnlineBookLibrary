package com.book.basicTypes;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "book")
public class Book implements Serializable{
    private long id;
    @XmlElement(name = "author", required = true)
    private String author;
    @XmlElement(name = "title", required = true)
    private String title;
    @XmlElement(name = "isbn", required = true)
    private String isbn;
    private String description;
    private File coverImage;
    private File bookText;
    private long countOfDownloads;

      public Book() {
    }

    public Book(String author, String title, String isbn, String description, File coverImage, File bookText) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.description = description;
        this.coverImage = coverImage;
        this.bookText = bookText;
    }

    public long getCountOfDownloads() {
        return countOfDownloads;
    }

    public void setCountOfDownloads(long countOfDownloads) {
        this.countOfDownloads = countOfDownloads;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public File getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(File coverImage) {
        this.coverImage = coverImage;
    }

    public File getBookText() {
        return bookText;
    }

    public void setBookText(File bookText) {
        this.bookText = bookText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (!author.equals(book.author)) return false;
        if (!title.equals(book.title)) return false;
        return isbn != null ? isbn.equals(book.isbn) : book.isbn == null;
    }

    @Override
    public int hashCode() {
        int result = author.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        return result;
    }
}
