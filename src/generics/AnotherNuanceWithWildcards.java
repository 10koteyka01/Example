package generics;

import java.util.ArrayList;
import java.util.Collection;

public class AnotherNuanceWithWildcards {
    //Collection<? extends T> coll, Sink<T> snk - вызов сработает
    //Collection<T> coll, Sink<? super T> snk
    public static <T> T writeAll(Collection<T> coll, Sink<T> snk) {
        T last = null;
        for (T t : coll) {
            last = t;
            snk.flush(last);
        }
        return last;
    }

    public static void main(String[] args) {
        Sink<Object> s = new SinkImpl<>();
        Collection<String> cs = new ArrayList<>();
//        String str = writeAll(cs, s); // Illegal call.
    }

}

interface Sink<T> {
    void flush(T t);
}

class SinkImpl<T> implements Sink {
    @Override
    public void flush(Object o) {

    }
}