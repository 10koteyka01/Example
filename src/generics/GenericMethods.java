package generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class GenericMethods {
    static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o);
        }
    }

    static void wildcardsMethod(Object[] a, Collection<?> c) {
        for (Object o : a) {
//            c.add(o);
        }
    }

    public static void main(String[] args) {
        Object[] oa = new Object[100];
        Collection<Object> collection = new ArrayList<>();

        fromArrayToCollection(oa, collection);

        String[] sa = new String[100];
        Number[] na = new Number[100];
        Collection<Number> cn = new ArrayList<>();
        Collection<String> cs = new ArrayList<>();

        fromArrayToCollection(na, cn);
//        fromArrayToCollection(na, cs);
    }
}
