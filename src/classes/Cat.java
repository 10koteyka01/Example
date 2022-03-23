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

        System.out.println("Конструктор с параметрами выполнился");
    }

    public Cat() {
        System.out.println("Пустой конструктор выполнился");
    }

    {
        name = "Фишка";
        color = "Белая";
        System.out.println("Блок инициализации выполнился");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
