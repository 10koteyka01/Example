package cycles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForCycle {

    public static void main(String[] args) {
        ArrayList<String> buf = new ArrayList<>() {{
            add("212");
            add("111");
            add("121");
            add("222");
        }};

        changeList2(buf).forEach(System.out::println);
    }

    static int sumX(int[] x){
        int sum = 0;
        for (int c : x) {
            sum += c;
        }
        return sum;
    }

    static int sumY1(List<Integer> y) {
        int sum = 0;
        for (int i : y) {
            sum += i;
        }
        return sum;
    }

    static int sumY(List<Integer> y) {
        int sum = 0;
        for (Iterator<Integer> i = y.iterator(); i.hasNext(); ) {
            sum += i.next();
        }
        return sum;
    }

    static List<String> changeList(List<String> buf) {
        List<String> newBuf = new ArrayList<>();
        for (int i = 0; i < buf.size(); i++) {
            newBuf.add(buf.get(i).replace('1', '3'));
        }

        return newBuf;
    }

    static List<String> changeList1(List<String> buf) {
        buf.forEach(word -> word.replace('1', '3'));
        return buf;
    }

    static List<String> changeList2(List<String> buf) {
        for (Iterator<String> i = buf.iterator(); i.hasNext(); ) {
            i.next().replace('1', '3');
        }
        return buf;
    }
}
