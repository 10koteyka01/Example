package generics;

public class SimpleBox {
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static void main(String[] args) {
        SimpleBox box = new SimpleBox();

        box.setObject(1);
        box.setObject(((String) box.getObject()).replace('А', 'о'));

        System.out.println(box.getObject());
    }
}
