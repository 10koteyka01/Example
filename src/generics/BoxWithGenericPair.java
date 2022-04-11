package generics;

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
}
