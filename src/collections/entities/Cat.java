package collections.entities;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Cat implements Comparator<Cat> {
    private String name;
    //Вес котика
    private Integer weight;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compare(Cat o1, Cat o2) {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public Comparator<Cat> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<Cat> thenComparing(Comparator<? super Cat> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<Cat> thenComparing(Function<? super Cat, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Cat> thenComparing(Function<? super Cat, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<Cat> thenComparingInt(ToIntFunction<? super Cat> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<Cat> thenComparingLong(ToLongFunction<? super Cat> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<Cat> thenComparingDouble(ToDoubleFunction<? super Cat> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}
