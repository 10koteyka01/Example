package arrays;

import java.io.Serializable;

public class ArrayInitialization {
    /**
     * Примеры инициализации массивов
     * @param args
     */
    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5, 6};

//        Cloneable iHaveAnArray;
//        Object iHaveAnArray;
        Serializable iHaveAnArray;

        int a1 = 1;
        String a2 = "3l";

        Object[] array = new Object[2];

        array[0] = a1;
        array[1] = a2;

        iHaveAnArray = array;

        Object[] areYouArray = (Object[]) iHaveAnArray;



        for (Object i : areYouArray) {
            System.out.println(i);
        }

        System.out.println("-----------------------------");

//        array = {1, 2};
//        array = new int[]{1, 2, 3, 4, 6};

        int ia[][] = { {1, 2}, {1, 2, 3}, {1, 2} };
//        int ia[][] = { {1, 2}, null };
//        int ia[][][] = new int[2][][];

//        System.out.println(ia.length);

        for (int[] ea : ia) {
            for (int e: ea) {
                System.out.println(e);
            }
        }

        System.out.println("-----------------------------");

        int i = 4;
        int ma[][] = new int[i][i=3];
        System.out.println(
                "[" + ma.length + "," + ma[0].length + "]");

        System.out.println("-----------------------------");

        /**
         * In an array access, the expression to the left of the brackets appears to be fully evaluated before
         * any part of the expression within the brackets is evaluated. For example, in the (admittedly monstrous)
         * expression a[(a=b)[3]], the expression a is fully evaluated before the expression (a=b)[3];
         * this means that the original value of a is fetched and remembered while the expression (a=b)[3] is evaluated.
         * This array referenced by the original value of a is then subscripted by a value that is element 3 of another
         * array (possibly the same array) that was referenced by b and is now also referenced by a.
         */

        int[] a = { 11, 12, 13, 14 };
        int[] b = { 0, 1, 2, 3 };
        System.out.println(a[(a=b)[3]]);
        System.out.println(a[3]);
    }


}
