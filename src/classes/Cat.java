package classes;

/**
 * Будет любить тебя чуток больше, если ты почешешь его за ушком и ласково назовёшь по имени,
 * но тут и тут не гладь!
 */
public class Cat {
    private String name;
    private String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Cat() {
    }

    {
        name = "Фишка";
        color = "Белая";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
