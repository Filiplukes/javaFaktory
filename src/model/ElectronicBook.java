package model;

import EnumType.BookTypeEnum;

import java.time.LocalDateTime;

public class ElectronicBook extends Book{

    private String brandBook;
    public ElectronicBook(String nameBook, String authorBook, int ratingBook, LocalDateTime dateCreateBook, String brandBook) {
        super(nameBook, authorBook, ratingBook, dateCreateBook, BookTypeEnum.electronics);
        this.brandBook = brandBook;
    }


    @Override
    public String writeBook() {
        return super.writeBook()+" brand" + brandBook;
    }
}
