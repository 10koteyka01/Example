package collections.entities;

public class ComparableCat implements Comparable<ComparableCat> {
    private String name;

    public ComparableCat(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(ComparableCat o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "ComparableCat{" +
                "name='" + name + '\'' +
                '}';
    }
}
