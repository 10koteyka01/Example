package anonymousClasses;

import java.util.function.Consumer;

class Cat {
    protected String name;

    public Cat(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println("Гуляет в лесу");
    }

    public void tellMeYourName() {
        System.out.println(name);
    }
}

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        cat.walk();
        cat.tellMeYourName();

        Cat cat1 = new Cat("Васька") {
            public void walk() {
                System.out.println("Домашняя кошечка живёт дома");
            }

            public void eat() {
                System.out.println("Дай пожраааать!!!");
            }
        };

        cat1.walk();
        cat1.tellMeYourName();
//        cat1.eat(); - не выполнится

        var cat2 = new Cat("Пушок") {

            public void walk() {
                System.out.println("Домашняя кошечка живёт дома");
            }

            public void eat() {
                System.out.println("Дай пожраааать!!!");
            }

            public void tellMeYourName() {
                System.out.println("Всё равно дай пожраааать!!!");
            }
        };

        cat2.eat();
        cat2.walk();
        cat2.tellMeYourName();

        Consumer<Cat> catConsumer = o -> System.out.println("Hi");

        catConsumer.accept(cat2);

    }
}
