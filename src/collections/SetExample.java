package collections;

import collections.entities.Cat;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//
//        set.add("Мама");
//        set.add("Мама");
//        set.add("Мама");
//        set.add("Мама");
//
//        set.forEach(System.out::println);
//        System.out.println("--------------------------");
//
//        Set<Cat> cats = new HashSet<>();
//
//        Cat cat = new Cat("Барсик");
//
//        cats.add(cat);
//        cats.add(cat);
//        cats.add(cat);
//        cats.add(cat);
//
//        cats.forEach(System.out::println);
//        System.out.println("--------------------------");
//
        Set<Cat> cats1 = new HashSet<>();

        cats1.add(new Cat("Барсик", 6));
        cats1.add(new Cat("Фишка", 3));
        cats1.add(new Cat("Биша", 2));
        cats1.add(new Cat("Сугроб", 10));

        cats1.forEach(System.out::println);
    }
}
