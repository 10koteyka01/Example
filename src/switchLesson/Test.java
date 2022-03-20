package switchLesson;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        getPlanetAtmosphereWithoutBrake(1);
    }


    /**
     * возможность работы с любым типом
     *
     * проверка на соответствие паттерну в case
     *
     * возможность обрабатывать null значения через встроенный case
     * @param o
     * @return
     */
    static String formatterPatternSwitch(Object o) {
        return switch (o) {
            case Integer i -> String.format("int %d", i);
            case Long l    -> String.format("long %d", l);
            case Double d  -> String.format("double %f", d);
            case String s  -> String.format("String %s", s);
                default        -> o.toString();
        };
    }

    /**
     * После расширения поддержки типов
     * @param s
     */
    static void checkNullNewRealization(String s) {
        switch (s) {
            case null         -> System.out.println("Oops");
            case "Foo", "Bar" -> System.out.println("Great");
            default           -> System.out.println("Ok");
        }
    }

    /**
     * До расширенной поддержки типов
     * @param s
     */
    static void checkNull(String s) {
        if (s == null) {
            System.out.println("oops!");
            return;
        }
        switch (s) {
            case "Foo", "Bar" -> System.out.println("Great");
            default           -> System.out.println("Ok");
        }
    }

    static void getPlanetAtmosphere(int seqNumberFromSun) {
        switch (seqNumberFromSun) {
            case 1: System.out.println("Нет атмосферы");
                break;
            case 2:
            case 4: System.out.println("Углекислый газ");
                break;
            case 3: System.out.println("Углекислый газ");
                System.out.println("Азот");
                System.out.println("Кислород");
                break;
            case 5:
            case 6: System.out.println("Водород");
                System.out.println("Гелий");
                break;
            case 7:
            case 8: System.out.println("Метан");
                System.out.println("Водород");
                System.out.println("Гелий");
                break;
            default:
                break;
        }
    }

    static void getPlanetAtmosphereWithoutBrake(int seqNumberFromSun) {
        switch (seqNumberFromSun) {
            case 1: System.out.println("Нет атмосферы");
            case 2:
            case 4: System.out.println("Углекислый газ");
            case 3: System.out.println("Углекислый газ");
                System.out.println("Азот");
                System.out.println("Кислород");
            case 5:
            case 6: System.out.println("Водород");
                System.out.println("Гелий");
            case 7:
            case 8: System.out.println("Метан");
                System.out.println("Водород");
                System.out.println("Гелий");
            default:
        }
    }

    static int beforeJava12(int count) {
        int value;
        switch (count) {
            case 1:
                value = 12;
                break;
            case 2:
                value = 32;
                break;
            case 3:
                value = 52;
                break;
            default:
                value = 0;
        }
        return value;
    }

    static int afterJava12(int count) {
        return switch (count) {
            case 1 -> 12;
            case 2 -> 32;
            case 3 -> 52;
            default -> 0;
        };
    }

    static int afterJava13(int count) {
        return switch (count) {
            case 1:
                yield 12;
            case 2:
                yield 32;
            case 3:
                yield 52;
            default:
                yield 0;
        };
    }
}
