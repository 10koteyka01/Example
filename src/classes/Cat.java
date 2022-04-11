package classes;


public class Cat {
    private String name;
    private String color;
    public static int catsCount = 2;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
//        System.out.println("Конструктор с параметрами");
    }

    public Cat() {
//        System.out.println("Пустой конструктор");
    }

    {
        name = "Шарик";
        color = "Чёрный";
//        System.out.println("Блок инициализации");
    }

    static {
        catsCount = 1;
//        System.out.println("Статический блок инициализации");
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Cat cat = (Cat) o;
        return false;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                "} - Ты без еды? Отвали!";
    }
}
