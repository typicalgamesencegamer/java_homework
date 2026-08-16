import ru.aston.hometask_1.ImmutableClass;
import ru.aston.hometask_1.SomeClass;

public class Main {
    static void main(String[] args) {
        SomeClass sClass = new SomeClass(10, new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        ImmutableClass iClass = new ImmutableClass(sClass);

        System.out.println("number в immutable классе до изменения");
        System.out.println(iClass.getSClass().getNumber());
        System.out.println("number в SomeClass классе до изменения");
        System.out.println(sClass.getNumber());

        sClass.setNumber(11);

        System.out.println("number в immutable классе после изменения");
        System.out.println(iClass.getSClass().getNumber());
        System.out.println("number в SomeClass классе после изменения");
        System.out.println(sClass.getNumber());

        System.out.println("---------------------------------");
        System.out.println("проверка геттера immutable класса");
        System.out.println("---------------------------------");

        SomeClass newClass = iClass.getSClass();

        System.out.println("получение number из нового класса");
        System.out.println(newClass.getNumber());
        System.out.println("получение number из immutable класса");
        System.out.println(iClass.getSClass().getNumber());
        newClass.setNumber(12);

        System.out.println("изменение number в новом классе");
        System.out.println(newClass.getNumber());
        System.out.println("получение number из immutable класса");
        System.out.println(iClass.getSClass().getNumber());
    }
}