package com.santos.matheus.models;

public class DigitalBook extends Book {
    private double fileSizeMB;

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    public DigitalBook(String title, int publicationYear, Author author, double fileSizeMB) {
        super(title, publicationYear, author);
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public void showDetails() {
        System.out.print("Livro Digital - Tamanho: " + this.fileSizeMB + "MB, ");
        super.showDetails();
    }
}
