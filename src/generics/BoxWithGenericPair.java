package generics;

import java.util.Locale;

public class BoxWithGenericPair <T, S> {
    private T firstParameter;
    private S secondParameter;

    public T getFirstParameter() {
        return firstParameter;
    }

    public void setFirstParameter(T firstParameter) {
        this.firstParameter = firstParameter;
    }

    public S getSecondParameter() {
        return secondParameter;
    }

    public void setSecondParameter(S secondParameter) {
        this.secondParameter = secondParameter;
    }

    public static void main(String[] args) {
        BoxWithGenericPair<String, Integer> box = new BoxWithGenericPair<>();

        box.setFirstParameter("Апельсинка");
        box.setSecondParameter(2);

        System.out.println("В коробке лежат " + box.getSecondParameter() + " " + box.getFirstParameter().toLowerCase(Locale.ROOT));
    }
}
