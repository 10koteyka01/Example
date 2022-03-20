package cycles;

public class WhileCycle {

    public static void main(String[] args) {
        limitedDoWhile1();
    }

    static void unlimitedWhile() {
//        int i = 0;
        while (true) {
            System.out.println("Hi");
//            i++;
//            if (i == 10) break;
        }
    }

    static void limitedWhile() {
        int i = 1;
        while (i <= 10) {
            System.out.println("Hi");
            i++;
        }
    }

    static void limitedWhile1() {
        int i = 1;
        while (i < 1) {
            System.out.println("Hi");
            i++;
        }
    }

    static void limitedDoWhile() {
        int i = 1;
        do {
            System.out.println("Hi");
            i++;
        }
        while (i < 1);
    }

    static void limitedDoWhile1() {
        int i = 1;
        do {
            System.out.println("Hi");
            System.out.println(i);
//            i++;
        }
        while (i != 1);
    }
}
