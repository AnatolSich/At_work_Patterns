package Composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape {
    int startX;
    int startY;
    int endX;
    int endY;

    List<Shape> components = new ArrayList<>();


    void addComponent(Shape shape) {
        if (components.size() == 0) {
            this.startX = shape.getStartX();
            this.startY = shape.getStartY();
            this.endX = shape.getEndX();
            this.endY = shape.getEndY();
            components.add(shape);
        } else {
            shape.move(components.get(components.size() - 1).getEndX(),components.get(components.size() - 1).getEndY());
            this.endX = shape.getEndX();
            this.endY = shape.getEndY();
            components.add(shape);
        }
        System.out.println("Added shape "+(components.size()-1));
    }

    void removeLastComponent() {
        components.remove(components.size() - 1);
        if (components.size() != 0) {
            this.endX = components.get(components.size() - 1).getEndX();
            this.endY = components.get(components.size() - 1).getEndY();
        } else {
            this.startX = 0;
            this.startY = 0;
            this.endX = 0;
            this.endY = 0;
        }
    }
    @Override
    public void move(int x,int y) {
        if (components.size() != 0) {
            this.startX = x;
            this.startY = y;
            components.get(0).move(x,y);
            for (int i = 1; i < components.size(); i++) {
                int a =components.get(i-1).getEndX();
                int b =components.get(i-1).getEndY();
                components.get(i).move(a,b);
            }
            this.endX = components.get(components.size() - 1).getEndX();
            this.endY = components.get(components.size() - 1).getEndY();
        }
    }
    @Override
    public int getStartX() {
        return this.startX;
    }

    @Override
    public int getStartY() {
        return this.startY;
    }

    @Override
    public int getEndX() {
        return this.endX;
    }

    @Override
    public int getEndY() {
        return this.endY;
    }

    @Override
    public void draw() {
        for (int i = 0; i <components.size() ; i++) {
            components.get(i).draw();
            System.out.printf("Compound from (%d,%d) to (%d,%d)\n", startX, startY, endX, endY);
        }
    }
}
