package generics;

public class Checks {
    BoxWithSingleGeneric<String> str = new BoxWithSingleGeneric<>();
    BoxWithSingleGeneric<Integer> i = new BoxWithSingleGeneric<>();
    boolean b = str.getClass() == i.getClass();

    public static void main(String[] args) {
        System.out.println();
    }
}

interface Convertable<T> {
    T convert();
}

class ReprChange <T extends Convertable<S>, S extends Convertable<T>> {
    T t;
    void set(S s) {t = s.convert();}
    S get() {return t.convert();}
}