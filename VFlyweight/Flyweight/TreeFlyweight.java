package VFlyweight.Flyweight;

import java.awt.Graphics;
import java.awt.Color;

public class TreeFlyweight {

    //Repeating state
    private String name;
    private Color color;
    private String otherTreeData;

    public TreeFlyweight(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    //Unique state takes to drawOperation() method
    public void drawOperation(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}