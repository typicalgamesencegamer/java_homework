package ru.aston.hometask_2;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int page_count;
    private int year_of_pub;

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage_count() {
        return page_count;
    }

    public void setPage_count(int page_count) {
        this.page_count = page_count;
    }

    public int getYear_of_pub() {
        return year_of_pub;
    }

    public void setYear_of_pub(int year_of_pub) {
        this.year_of_pub = year_of_pub;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, page_count, year_of_pub);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book other = (Book) obj;
        return this.title.equals(other.title) &&
                this.author.equals(other.author) &&
                this.page_count == other.page_count &&
                this.year_of_pub == other.year_of_pub;
    }
}
