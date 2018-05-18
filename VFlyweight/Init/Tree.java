package VFlyweight.Init;

import java.awt.*;

public class Tree {
    private int x;
    private int y;
    private String name;
    private Color color;
    private String otherTreeData;

    public Tree(int x, int y, String name, Color color, String otherTreeData) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}