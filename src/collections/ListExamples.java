package collections;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {




    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("Мама");
        strings.add("Мама");
        strings.add("Мама");
        strings.add("Мама");

        strings.forEach(System.out::println);
        System.out.println("--------------------------");

        strings.add("Мама");
        strings.add("Мыла");
        strings.add("Пилораму");
        strings.add("Мамы хватило не на долго");

        strings.forEach(System.out::println);
        System.out.println("--------------------------");

        strings.add(0, "Должен быть первым элементом 0");
        strings.add(0, "Должен быть первым элементом 1");
        strings.add(0, "Должен быть первым элементом 2");
        strings.add(0, "Должен быть первым элементом 3");

        strings.forEach(System.out::println);
    }
}
