package codingEncoding;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Box box = new Test.Box();

        box.cats.add(new Cat("Барсик"));

        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Zver\\Desktop\\Example\\Example\\src\\codingEncoding\\test.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);

        oos.writeObject(box);

        oos.close();


        FileInputStream fis = new FileInputStream("C:\\Users\\Zver\\Desktop\\Example\\Example\\src\\codingEncoding\\test.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Box box1 = (Box) ois.readObject();

        System.out.println();
    }

    static class Box implements Serializable {
        List<Cat> cats = new ArrayList();
    }

    static class Cat implements Serializable{
        public String name;

        public Cat(String name) {
            this.name = name;
        }
    }
}
