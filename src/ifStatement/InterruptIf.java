package ifStatement;

public class InterruptIf {
    public static void main(String[] args) {
        try {
            if (checkException())
                System.out.println("It's true");
            else
                System.out.println("hi");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Boolean checkBooleanNPE() {
        return null;
    }

    private static boolean checkException() throws Exception {
        throw new Exception("Hi");
    }
}
