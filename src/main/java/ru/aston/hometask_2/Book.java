package ru.aston.hometask_2;

public class Book {
    private String title;
    private Integer yearOfPublication;
    private Integer pageCount;

    public Book(String title, Integer yearOfPublication, Integer pageCount) {
        if (title != null) {
            this.title = title;
        }
        if (yearOfPublication != null) {
            this.yearOfPublication = yearOfPublication;
        }
        if (pageCount != null) {
            this.pageCount = pageCount;
        }
    }
}
