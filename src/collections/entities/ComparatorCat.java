package collections.entities;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class ComparatorCat implements Comparator<ComparatorCat> {
    private String name;

    public ComparatorCat(String name) {
        this.name = name;
    }

    @Override
    public int compare(ComparatorCat o1, ComparatorCat o2) {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public Comparator<ComparatorCat> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<ComparatorCat> thenComparing(Comparator<? super ComparatorCat> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<ComparatorCat> thenComparing(Function<? super ComparatorCat, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<ComparatorCat> thenComparing(Function<? super ComparatorCat, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<ComparatorCat> thenComparingInt(ToIntFunction<? super ComparatorCat> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<ComparatorCat> thenComparingLong(ToLongFunction<? super ComparatorCat> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<ComparatorCat> thenComparingDouble(ToDoubleFunction<? super ComparatorCat> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}
