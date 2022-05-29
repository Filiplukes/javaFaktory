package model;

import EnumType.BookTypeEnum;

import java.time.LocalDateTime;

public class PictrureBook extends Book{
    private String typeBook;
    private int age;
    public PictrureBook(String nameBook, String authorBook, int ratingBook, LocalDateTime dateCreateBook, String typeBook, int age) {
        super(nameBook, authorBook, ratingBook, dateCreateBook, BookTypeEnum.picture);
        this.typeBook = typeBook;
        this.age = age;
    }




}
