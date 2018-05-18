package VFlyweight.Flyweight;

import java.awt.*;

public class TreeContext {

    //Unique state
    private int x;
    private int y;

    //Flyweight
    private TreeFlyweight treeFlyweight;

    public TreeContext(int x, int y, TreeFlyweight treeFlyweight) {
        this.x = x;
        this.y = y;
        this.treeFlyweight = treeFlyweight;
    }

    public void drawOperation(Graphics g) {
        treeFlyweight.drawOperation(g, x, y);
    }
}