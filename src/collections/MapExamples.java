package collections;

import collections.entities.Cat;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Мама");
        map.put(1, "Мыла");
        map.put(1, "Раму");

        map.forEach((k, v) -> System.out.println(k + "  value = " + v));
        System.out.println("--------------------------");

        map.put(1, "Мама");
        map.put(2, "Мыла");
        map.put(3, "Раму");

        map.forEach((k, v) -> System.out.println(k + "  value = " + v));
        System.out.println("--------------------------");

        Map<String, Cat> cats = new HashMap<>();

        cats.put("Первый котик", new Cat("Васька"));
        cats.put("Второй котик", new Cat("Васька"));
        cats.put("Третий котик", new Cat("Васька"));
        cats.put("Четвёртый котик", new Cat("Васька"));

        cats.forEach((k, v) -> System.out.println(k + "  value = " + v));
        System.out.println("--------------------------");

        Map<String, Cat> clonedCats = new HashMap<>();
        Cat cat = new Cat("Долли");

        clonedCats.put("Первый котик", cat);
        clonedCats.put("Второй котик", cat);
        clonedCats.put("Третий котик", cat);
        clonedCats.put("Четвёртый котик", cat);

        clonedCats.forEach((k, v) -> System.out.println(k + "  value = " + v));
        System.out.println("--------------------------");

        Map<String, Cat> treeMap = new TreeMap<>();

        treeMap.put("Первый котик", cat);
        treeMap.put("Второй котик", cat);
        treeMap.put("Третий котик", cat);
        treeMap.put("Четвёртый котик", cat);

        treeMap.forEach((k, v) -> System.out.println(k + "  value = " + v));
        System.out.println("--------------------------");

        Map<Integer, Cat> treeMapByInteger = new TreeMap<>();

        treeMapByInteger.put(4, new Cat("Васька"));
        treeMapByInteger.put(2, new Cat("Пушок"));
        treeMapByInteger.put(3, new Cat("Торопунько"));
        treeMapByInteger.put(1, new Cat("Сугроб"));

        treeMapByInteger.forEach((k, v) -> System.out.println(k + "  value = " + v));
    }
}
