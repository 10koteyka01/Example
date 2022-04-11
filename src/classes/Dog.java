package classes;

public class Dog {
    private String name;
    private String color;

    {
        name = "Шарик";
        color = "Чёрный";
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                "} - Гав - гав";
    }
}
