package collections;

import collections.entities.ComparableCat;

import java.util.HashSet;
import java.util.Set;

public class ComparatorExamples {

    public static void main(String[] args) {
        Set<ComparableCat> catSet = new HashSet<>();

        catSet.add(new ComparableCat("Васька"));
        catSet.add(new ComparableCat("Васька"));
        catSet.add(new ComparableCat("Пушок"));
        catSet.add(new ComparableCat("Пирожок"));

        catSet.forEach(System.out::println);
    }
}
