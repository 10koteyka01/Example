package collections;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Мама");
        set.add("Мама");
        set.add("Мама");
        set.add("Мама");

        set.forEach(System.out::println);
        System.out.println("--------------------------");

        set.add("Мама");
        set.add("Мыла");
        set.add("Пилораму");
        set.add("Мамы хватило не на долго");

        set.forEach(System.out::println);
        System.out.println("--------------------------");

        set.add("Должен быть первым элементом 0");
        set.add("Должен быть первым элементом 1");
        set.add("Должен быть первым элементом 2");
        set.add("Должен быть первым элементом 3");

        set.forEach(System.out::println);
    }
}
