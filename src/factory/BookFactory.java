package factory;

import model.Book;
import model.ClassicalBook;
import model.ElectronicBook;
import model.PictrureBook;

import java.time.LocalDateTime;

public class BookFactory {

    public static Book createNewBook(String nameBook, String authorBook, int ratingBook, int countPage) {
        ClassicalBook newBook = null;
        LocalDateTime dateCreateBook =  LocalDateTime.now();;
        newBook = new ClassicalBook(nameBook,authorBook,ratingBook, dateCreateBook, countPage);
        return newBook;
    }
    public static Book createNewBook(String nameBook, String authorBook, int ratingBook, String brandBook) {
        ElectronicBook newBook = null;
        LocalDateTime dateCreateBook =  LocalDateTime.now();;
        newBook = new ElectronicBook(nameBook,authorBook,ratingBook, dateCreateBook, brandBook);
        return newBook;
    }

    public static Book createNewBook(String nameBook, String authorBook, int ratingBook, String typeBook, int age) {
        PictrureBook newBook = null;
        LocalDateTime dateCreateBook =  LocalDateTime.now();;
        newBook = new PictrureBook(nameBook,authorBook,ratingBook, dateCreateBook, typeBook, age);
        return newBook;
    }

}
