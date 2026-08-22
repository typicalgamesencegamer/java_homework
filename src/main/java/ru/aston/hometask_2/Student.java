package ru.aston.hometask_2;

import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<Book> books;

    public Student() {}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Student:\n" +
                "\tname: " + name + "\n" +
                "\tage: " + age;
    }
}
