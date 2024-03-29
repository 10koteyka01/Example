package arrays;

public class OutOfMemoryError {
    /**
     * Пример OutOfMemoryError, возникшего после инициализации поля olden значением len
     * @param args
     */
    public static void main(String[] args) {
        int len = 0, oldlen = 0;
        Object[] a = new Object[0];
        try {
            for (;;) {
                ++len;
                Object[] temp = new Object[oldlen = len];
                temp[0] = a;
                a = temp;
            }
        } catch (Error e) {
            System.out.println(e + ", " + (oldlen==len));
//            System.out.println(oldlen);
        }
    }
}
