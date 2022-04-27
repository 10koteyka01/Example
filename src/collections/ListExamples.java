package collections;

import collections.entities.Cat;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
//        List<String> strings = new ArrayList<>();
////        List<String> anotherStrings = new LinkedList<>();
//
//        strings.add("Мама");
//        strings.add("Мама");
//        strings.add("Мама");
//        strings.add("Мама");
//
//        strings.forEach(System.out::println);
//        System.out.println("--------------------------");
//
//        strings.add("Мама");
//        strings.add("Мыла");
//        strings.add("Пилораму");
//        strings.add("Мамы хватило не на долго");
//
//
//        strings.forEach(System.out::println);
//        System.out.println("--------------------------");
//
//        strings.add(0, "Должен быть первым 1");
//        strings.add(1, "Должен быть первым 2");
//
//        for (int i = 0; i <= 40; i++)
//            strings.add("Привет");
//        strings.add(42, "Должен быть первым 3");
//
//        strings.forEach(System.out::println);
//        System.out.println("--------------------------");

        List<Cat> cats1 = new ArrayList<>();

        cats1.add(new Cat("Барсик", 6));
        cats1.add(new Cat("Фишка", 3));
        cats1.add(new Cat("Биша", 2));
        cats1.add(new Cat("Сугроб", 10));

//        cats1.sort(Cat::compareTo);

        cats1.forEach(System.out::println);
    }
}
