import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ru.aston.hometask_2.Book;
import ru.aston.hometask_2.Student;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        List<Student> students = null;
        try (FileInputStream fis = new FileInputStream(new File("src/main/resources/students.json"))) {
            students = mapper.readValue(fis, new TypeReference<List<Student>>() {});
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        if (students != null) {
            students.stream()
                    .peek(System.out::println)
                    .filter(student -> student.getBooks() != null)
                    .flatMap(student -> student.getBooks().stream())
                    .sorted(Comparator.comparingInt(Book::getPage_count))
                    .distinct()
                    .filter(book -> book.getYear_of_pub() > 2000)
                    .limit(3)
                    .map(Book::getYear_of_pub)
                    .findFirst()
                    .ifPresentOrElse((year) -> System.out.println("Год выпуска найденной книги: " + year),
                            () -> System.out.println("Таких книг не найдено"));
        }
    }
}