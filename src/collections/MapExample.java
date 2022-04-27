package collections;

import collections.entities.Cat;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
//        Map<Integer, String> map = new HashMap<>();
//
//        map.put(1, "Мама");
//        map.put(2, "Мама");
//        map.put(3, "Мама");
//        map.put(1, "Мама");
//        map.put(1, "Мама");
//        map.put(1, "Мама");
//
//        map.forEach((k, v) -> System.out.println(k + " value = " + v));
//        System.out.println("--------------------------");
//
        Map<String, Cat> catMap = new HashMap<>();

        catMap.put("Первый котик", new Cat("Барсик"));
        catMap.put("Второй котик", new Cat("Васька"));
        catMap.put("Третий котик", new Cat("Персик"));
        catMap.put("Четвёртый котик", new Cat("Сугроб"));

        catMap.forEach((k, v) -> System.out.println(k + " value = " + v));
        System.out.println("--------------------------");

        Map<Integer, Cat> treeMap = new TreeMap<>();

        treeMap.put(1, new Cat("Барсик"));
        treeMap.put(3, new Cat("Васька"));
        treeMap.put(2, new Cat("Персик"));
        treeMap.put(4, new Cat("Сугроб"));

        treeMap.forEach((k, v) -> System.out.println(k + " value = " + v));
        System.out.println("--------------------------");
    }
}
