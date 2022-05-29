package model;

import EnumType.BookTypeEnum;

import java.time.LocalDateTime;

public class ClassicalBook extends Book{
    private int countPage;
    public ClassicalBook(String nameBook, String authorBook, int ratingBook, LocalDateTime dateCreateBook,int countPage) {
        super(nameBook, authorBook, ratingBook, dateCreateBook, BookTypeEnum.classical);
        this.countPage = countPage;
                 }


    @Override
    public String writeBook() {

        String text = super.writeBook() + "clascic" + countPage;
        return text;
    }

    public String writeBook(String test){

        return test +" +++++ "+ countPage + "---" + authorBook ;
    }

}
