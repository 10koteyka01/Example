package arrays;

import java.util.Arrays;

public class SimpleArrayInitialization {
    public static void main(String[] args) {
        int[] cats;

        cats = new int[10];

        /**
         * Всем элементам массива автоматически присваиваются значения по умолчанию.
         * Например, для числовых значений начальное значение будет 0.
         * Для массива типа boolean начальное значение будет равно false,
         * для массива типа char - '\u0000', для массива типа класса (объекты) - null.
         */

        //int[] cats = new int[10];

        int[] initializedArray = {1, 2, 4, 10};
        int[] newArray = initializedArray;
        int[] copiedArray = Arrays.copyOf(initializedArray, initializedArray.length);

        newArray[2] = 100;

        System.out.println("initializedArray " + Arrays.toString(initializedArray) + " newArray " + Arrays.toString(newArray));
        System.out.println("initializedArray " + Arrays.toString(initializedArray) + " copiedArray " + Arrays.toString(copiedArray));

        Arrays.sort(copiedArray);

        System.out.println("Sorted array " + Arrays.toString(copiedArray));

        /**
         * Java поняла, что второй Integer[] - имя переменной
         */
//        Integer[] Integer[] = {{1, 2, 3}, {4, 0, 0,},};
//        System.out.println(Arrays.deepToString(Integer));
        Integer[][] buf = {{1, 2, 3}, {4, 0, 0,},};
        Integer[][] buf1 = {{1, 2, 3}, {4, 0, 0,},};

//        Arrays.sort(buf);

        System.out.println(Arrays.toString(buf));
        System.out.println(Arrays.deepToString(buf));

        System.out.println(buf.equals(buf1));
        System.out.println(Arrays.equals(buf, buf1));
        System.out.println(Arrays.deepEquals(buf, buf1));

    }
}
