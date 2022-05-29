package controller;

import factory.BookFactory;
import model.Book;
import model.ClassicalBook;
import model.ElectronicBook;
import model.PictrureBook;

public class Main {

    public static void  main(String [] args)   //statická metoda
    {
        ClassicalBook rbitov = (ClassicalBook) BookFactory.createNewBook("rbitov zviratek","King",5,352);
        System.out.println(rbitov.writeBook());
        System.out.println(rbitov.writeBook("asd"));
        ElectronicBook elBook = (ElectronicBook) BookFactory.createNewBook("ELk kniha","test",5,"nejakaelk");
        System.out.println(elBook.writeBook());
        PictrureBook picBook = (PictrureBook) BookFactory.createNewBook("obrazkova","King",4,"dospela",18);
        System.out.println(picBook.writeBook());
    }




}
