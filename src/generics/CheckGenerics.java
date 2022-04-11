package generics;

public class CheckGenerics {
    BoxWithSingleGeneric<String> str = new BoxWithSingleGeneric<>();
    BoxWithSingleGeneric<Integer> i = new BoxWithSingleGeneric<>();
    boolean b = str.getClass() == i.getClass();

    public static void main(String[] args) {
    }
}

interface ConvertibleTo<T> {
    T convert();
}

//Границы переменных взаимно рекурсивного типа
class ReprChange<T extends ConvertibleTo<S>,
        S extends ConvertibleTo<T>> {
    T t;
    void set(S s) { t = s.convert();    }
    S get()       { return t.convert(); }
}

//Вложенные обобщённые классы
class Seq<T> {
    T      head;
    Seq<T> tail;

    Seq() { this(null, null); }
    Seq(T head, Seq<T> tail) {
        this.head = head;
        this.tail = tail;
    }
    boolean isEmpty() { return tail == null; }

    class Zipper<S> {
        Seq<Pair<T,S>> zip(Seq<S> that) {
            if (isEmpty() || that.isEmpty()) {
                return new Seq<Pair<T,S>>();
            } else {
                Seq<T>.Zipper<S> tailZipper =
                        tail.new Zipper<S>();
                return new Seq<Pair<T,S>>(
                        new Pair<T,S>(head, that.head),
                        tailZipper.zip(that.tail));
            }
        }
    }
}


class Pair<T, S> {
    T fst; S snd;
    Pair(T f, S s) { fst = f; snd = s; }
}


class Test {
    public static void main(String[] args) {
        Seq<String> strs =
                new Seq<String>(
                        "a",
                        new Seq<String>("b",
                                new Seq<String>()));
        Seq<Number> nums =
                new Seq<Number>(
                        1,
                        new Seq<Number>(1.5,
                                new Seq<Number>()));

        Seq<String>.Zipper<Number> zipper =
                strs.new Zipper<Number>();

        Seq<Pair<String,Number>> combined =
                zipper.zip(nums);
    }
}