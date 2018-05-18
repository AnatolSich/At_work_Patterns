package VFlyweight.Flyweight;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

//Additional class with method for creating trees, method for store its in list
// and method to make its visible in JFrame
public class Forest extends JFrame {

    private List<TreeContext> trees = new ArrayList<>();

    //creating trees from Flyweight object and Context object
    public void createTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeFlyweight treeFlyweight = TreeFlyweightFactory.getTreeFlyweight(name, color, otherTreeData);
        TreeContext treeContext = new TreeContext(x, y, treeFlyweight);
        trees.add(treeContext);
    }

    @Override
    public void paint(Graphics graphics) {
        for (TreeContext treeContext : trees) {
            treeContext.drawOperation(graphics);
        }
    }
}