package ifStatement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        List<Integer> buf = new ArrayList<>() {{
           add(212);
           add(333);
           add(111);
           add(121);
        }};

        sum(buf).forEach(System.out::println);
    }

    static List<Integer> sum(List<Integer> b) throws Exception {
        List <Integer> bbb = new ArrayList<>();
        for (int i = 0; i < b.size(); i++) {
            b.set(i, 1);
        }
        throw new Exception("ex");
    }

    static List<Integer> sum2(List<Integer> b) {
        for (Integer s : b) {
            s = 1;
        }
        return b;
    }

    static List<Integer> sum3(List<Integer> b) {
        for (Iterator<Integer> i = b.iterator(); i.hasNext();) {
            Integer s = i.next();

            s = 1;
        }
        return b;
    }

    static void sum1(List<Integer> b) {
        b.forEach(s -> s = 1);
    }
}
