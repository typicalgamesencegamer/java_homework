package ru.aston.hometask_2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Book> books;
    private String name;
    private Integer age;

    public Student(Integer age, String name, List<Book> books) {
        if (age != null) {
            this.age = age;
        }
        if (name != null) {
            this.name = name;
        }
        if (books != null) {
            this.books = List.copyOf(books);
        }
    }

    public void setBooks(List<Book> books) {
        this.books = new  ArrayList<>(books);
    }
    public void getBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
