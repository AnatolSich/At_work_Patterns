package VFlyweight.Init;

import java.awt.*;

public class FlyweightTest {
    static int CANVAS_SIZE = 500;
    static int TREES_TO_DRAW = 1000000;

    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);

        for (int i = 0; i < Math.floor(TREES_TO_DRAW); i++) {
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak", Color.GREEN, "Oak texture stub");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak", Color.GREEN, "Oak texture stub");
            if (i % 5 == 0) {
                forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                        "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
                forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                        "Deep autumn Oak", Color.RED, "Deep autumn Oak texture stub");
            }
        }

        forest.setVisible(true);

        System.out.println((int)(TREES_TO_DRAW * 2.4) + " trees drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("One tree memory size - 38 bytes");
        System.out.println("---------------------");
        System.out.println("Total: " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}