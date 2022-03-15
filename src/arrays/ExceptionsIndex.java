package arrays;

public class ExceptionsIndex {

    /**
     * Исключение возникает до выполнения операции присваивания
     * @param args
     */
//    public static void main(String[] args) {
//        int index = 1;
//        try {
//            skedaddle()[index=2]++;
//        } catch (Exception e) {
//            System.out.println(e + ", index=" + index);
//        }
//    }
//    static int[] skedaddle() throws Exception {
//        throw new Exception("Ciao");
//    }


    /**
     * Исключение возникает уже после операции присваивания, т.к. массив мы проинициализировали
     * null, но налетели на npe, когда решили попробовать им воспользоваться.
     * @param args
     */
    public static void main(String[] args) {
        int index = 1;
        try {
            nada()[index=2]++;
        } catch (Exception e) {
            System.out.println(e + ", index=" + index);
        }
    }
    static int[] nada() { return null; }
}
