package pl.sda.student;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Category category1 = new Category("dramat");
        Category category2 = new Category("komedia");
        Category category3 = new Category("horror");

        Author author1 = new Author("Henryk", "Sienkiewicz");
        Author author2 = new Author("Adam", "Prus");
        Author author3 = new Author("Boleslaw", "Chrobry");
        Book book1 = new Book("Ten Obcy", author1, category1);
        Book book2 = new Book("Dziwny", author2, category2);
        Book book3 = new Book("jakotako", author3, category3);

        ArrayList<Book> lista = new ArrayList<Book>();
        lista.add(book1);
        lista.add(book2);
        lista.add(book3);

        JSONUtils jsonUtils1 = new JSONUtils();
        jsonUtils1.writeList("lista.json", lista);
        jsonUtils1.readList("lista.json", lista);
    }
}