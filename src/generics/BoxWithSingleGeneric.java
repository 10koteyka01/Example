package generics;

public class BoxWithSingleGeneric <T>{
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public static void main(String[] args) {
        BoxWithSingleGeneric<String> box = new BoxWithSingleGeneric<>();

        box.setObject("Апельсин");
        box.setObject(box.getObject().replace('А', 'о'));

        System.out.println(box.getObject());
    }
}
