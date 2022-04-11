package classes;

import arrays.UnaryNumericPromotion;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class ConstructorTest {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Cat cat = new Cat("Барсик", "Серый");
//        Cat cat1 = new Cat("Фишка", "Белый с чёрным");
//
////        System.out.println(dog);
//        System.out.println(cat);
//        System.out.println(cat1);

//        UnaryNumericPromotion unp = new UnaryNumericPromotion();
//        unp.setPrivField(1)
//                .setProtField(2)
//                .setPubField(5);
//
//
//
//        System.out.println(unp.getPrivField());
//        System.out.println(unp.getProtField());
//        System.out.println(unp.getPubField());

        Cat cat = new Cat();
        Cat cat1 = new Cat();

        Set<Cat> set = new HashSet<>();

        set.add(cat);
        set.add(cat1);
        set.add(cat);
        set.add(cat);

        System.out.println(set.size());

    }
}
