package Prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeTest {
    public static void main(String[] args) {
        CopyFactory copyFactory = new CopyFactory();
        Car carM = new Car("Mers", 5);
        Car carN = new Car("Niva", 7);
        Car carB = new Car("Buick", 25);
        Car carF = new Car("FW", 1);
        Car carK = new Car("KRAZ", 3);
        Car carL = new Car("LADA", 8);

        System.out.println(copyFactory.getNewCopy(carM));
        System.out.println(copyFactory.getNewCopy(carN));
        System.out.println(copyFactory.getNewCopy(carB));
        System.out.println(copyFactory.getNewCopy(carF));
        System.out.println(copyFactory.getNewCopy(carK));
        System.out.println(copyFactory.getNewCopy(carL));
        System.out.println(copyFactory.getNewCopy(carM));
    }
}

class CopyFactory {
    static Map<String, Car> cache = new HashMap<>();

    public Car getNewCopy(Car car) {
        if (cache.containsValue(car)) return cache.get(car.getName()).copy();
        else {
            cache.put(car.getName(), car);
            return car.copy();
        }
    }
}

interface Copiable {
    Object copy();
}

class Car implements Copiable {
    private String name;
    private int age;

    public Car(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public Car copy() {
        return new Car(this.name, this.age);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}