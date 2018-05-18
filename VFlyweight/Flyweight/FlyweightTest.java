package VFlyweight.Flyweight;

import java.awt.*;
import java.util.Iterator;
import java.util.Map;

public class FlyweightTest {
    static int CANVAS_SIZE = 500;
    static int TREES_TO_DRAW = 1000000;
    static int TREE_TYPES = 3;

    public static void main(String[] args) {

        //Creating additional class instance
        Forest forest = new Forest();

        //Creating trees
        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.createTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak", Color.GREEN, "Oak texture stub");
            if (i % 5 == 0) {
                forest.createTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                        "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
                forest.createTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                        "Deep autumn Oak", Color.RED, "Deep autumn Oak texture stub");
            }
        }

        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        System.out.println("Number of Flyweights in Cache:");
        Iterator<Map.Entry<String, TreeFlyweight>> mapIterator = TreeFlyweightFactory.treeFlyweightsCache.entrySet().iterator();
        int i = 1;
        while (mapIterator.hasNext()) {
            System.out.print(i + ". ");
            System.out.println(mapIterator.next());
            i++;
        }
        System.out.println();

        System.out.println(TREES_TO_DRAW * 11 / 15 + " trees drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("TreeContext memory size - 8 bytes");
        System.out.println("TreeFlyweight memory size ~30 bytes");
        System.out.println("---------------------");
        System.out.println("Total: " + ((TREES_TO_DRAW * 11 / 15 * 8 + TREE_TYPES * 30) / 1024 / 1024) + "MB");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}