package model;

import EnumType.BookTypeEnum;
import Interface.BookInterface;

import java.time.LocalDateTime;

public abstract class Book implements BookInterface {

    protected String nameBook;
    protected String authorBook;
    protected int ratingBook;
    protected BookTypeEnum bookType;
    protected LocalDateTime dateCreateBook;


    public Book(String nameBook, String authorBook, int ratingBook, LocalDateTime dateCreateBook,BookTypeEnum bookType) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.ratingBook = ratingBook;
        this.dateCreateBook = dateCreateBook;
        this.bookType = bookType;
    }


    public String writeBook(){

        return nameBook+","+ authorBook+","+ratingBook+","+ dateCreateBook+","+bookType;

    }
    @Override
    public void addBook() {

    }

    @Override
    public Book getBook() {
        return null;
    }

    @Override
    public void updateBook() {


    }
}
