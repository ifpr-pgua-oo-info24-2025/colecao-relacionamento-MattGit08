package com.santos.matheus;

import com.santos.matheus.models.Book;
import com.santos.matheus.models.DigitalBook;
import com.santos.matheus.models.PrintedBook;
import com.santos.matheus.models.Author;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    ArrayList<Book> library = new ArrayList<Book>();

    Author author1 = new Author("Antoine de Saint-Exupery", "Francesa");
    Author author2 = new Author("Daniel Defoe", "Ingles");
    Author author3 = new Author("Monteiro Lobato", "Brasileiro");
    Author author4 = new Author("Robert Louis Stevenson","Escoces");

    PrintedBook book1 = new PrintedBook("O Pequeno Principe", 1943, author1, 96);
    PrintedBook book2 = new PrintedBook("Robinson Crusoe", 1719, author2, 408);

    DigitalBook book3 = new DigitalBook("O Presidente Negro", 1926, author3, 2.0);
    DigitalBook book4 = new DigitalBook("A Ilha do Tesouro", 1883, author4, 3.5);

    library.add(book1);
    library.add(book2);
    library.add(book3);
    library.add(book4);

    for (Book book : library) {
        book.showDetails();
    }
  }
}
