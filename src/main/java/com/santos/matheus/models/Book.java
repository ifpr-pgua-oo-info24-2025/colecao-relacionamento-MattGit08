package com.santos.matheus.models;

public class Book {
    private String title;
    private int publicationYear;
    private Author author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Author getAuthor() {
        return author;
    }
    
    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book(String title, int publicationYear, Author author) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }
    public void showDetails() {
        System.out.println(
        "Titulo: " +  this.title + ", " +
        "Ano: " + this.publicationYear + "\n" +
        "Autor: " + this.author.getName() + ", " +
        "Nacionalidade: " + this.author.getNationality() + "\n");
    }
}
