package arrays;

public class IndexException {

    /**
     * Исключение выброшено до инициализации i в первом случае, во втором инициализация успела произойти.
     * @param args
     */
    public static void main(String[] args) {
        int[][] a = { { 00, 01 }, { 10, 11 } };
        int i = 99;
        try {
//            a[val()][i = 1]++;
            a[i = 1][val()]++;
        } catch (Exception e) {
            System.out.println(e + ", i=" + i);
        }
    }
    static int val() throws Exception {
        throw new Exception("unimplemented");
    }
}
