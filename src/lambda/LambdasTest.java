package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdasTest {
    public static void main(String[] args) {
//        new Thread(() -> System.out.println("Приет, я - лямбда")).start();

        List<String> cats = Arrays.asList("Барсик", "Пушок", "Фишка");
//
//
//        cats.forEach(System.out::println);
//
//        cats.forEach(cat -> System.out.printf("Очередного котика зовут %s%n", cat));
//
//        System.out.println(cats.stream().findFirst().orElseGet(null));
//        System.out.println(cats.stream().filter(cat -> cat.startsWith("Пуш")).findFirst().orElseGet(null));

        List<String> filteredCats = cats.stream().filter(cat -> cat.length() == 5).collect(Collectors.toList());

        filteredCats.forEach(System.out::println);
    }
}
