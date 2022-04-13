package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Wildcards {
    static void printCollection(Collection c) {
        Iterator k = c.iterator();
        for (int i = 0; i <= c.size(); i++) {
            System.out.println(k.next());
        }
    }

    static void printGenCollection(Collection<String> c) {
        for (String o : c) {
            System.out.println(o);
        }
    }

    static void printWildcardCollection(Collection<?> c) {
        for (Object o : c) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        printWildcardCollection(collection);

        Collection<Integer> collection1 = new ArrayList<>();
        printWildcardCollection(collection1);
    }
}
