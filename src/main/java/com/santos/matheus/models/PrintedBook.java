package com.santos.matheus.models;

public class PrintedBook extends Book {
    private int numberOfPages;

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public PrintedBook(String title, int publicationYear, Author author, int numberOfPages) {
        super(title, publicationYear, author);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void showDetails() {
        System.out.print("Livro Fisico - Paginas: " + this.numberOfPages + ", ");
        super.showDetails();
    }
}   
