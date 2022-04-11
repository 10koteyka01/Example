package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//подстановочные знаки
public class Wildcards {
    void printCollection(Collection c) {
        Iterator i = c.iterator();
        for (int k = 0; k < c.size(); k++) {
            System.out.println(i.next());
        }
    }

    void printGenCollection(Collection<Object> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }

    void printGenCollection1(Collection<?> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Collection<?> c = new ArrayList<String>();
//        c.add(new Object()); // Compile time error
    }
}
